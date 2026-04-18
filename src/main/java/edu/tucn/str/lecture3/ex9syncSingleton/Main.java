package edu.tucn.str.lecture3.ex9syncSingleton;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        new Thread(() -> MySingleton.getInstance()).start();
        new Thread(() -> MySingleton.getInstance()).start();
        new Thread(() -> MySingleton.getInstance()).start();
    }
}
