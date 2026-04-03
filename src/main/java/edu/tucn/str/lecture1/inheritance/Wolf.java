package edu.tucn.str.lecture1.inheritance;

import java.util.Objects;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Wolf extends Animal {
    int numOfLegs = 4;

    public Wolf() {
        super("Wolf");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("And it's a wolf");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "numOfLegs=" + numOfLegs +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return numOfLegs == wolf.numOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numOfLegs);
    }
}
