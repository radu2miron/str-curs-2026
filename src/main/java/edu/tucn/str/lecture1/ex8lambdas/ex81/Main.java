package edu.tucn.str.lecture1.ex8lambdas.ex81;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */
public class Main {
    public static void main(String[] args) {
        // anonymous class implementation for Performer
        Performer implementation1 = new Performer() {
            @Override
            public int performOperation(String x) {
                return x.compareTo("a");
            }
        };
        System.out.println(implementation1.performOperation("b")); // 1 ("b" > "a")

        // lambda expression for Performer implementations
        Performer implementation2 = x -> x.length();
        System.out.println(implementation2.performOperation("abdefg")); // 6

        Performer implementation3 = s -> s.indexOf("!");
        System.out.println(implementation3.performOperation("abc!efg!"));
    }
}

@FunctionalInterface
interface Performer {
    int performOperation(String x);
}
