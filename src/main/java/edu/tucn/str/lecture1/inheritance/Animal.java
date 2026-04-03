package edu.tucn.str.lecture1.inheritance;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void eat() {
        System.out.println("The animal is eating");
    }
}
