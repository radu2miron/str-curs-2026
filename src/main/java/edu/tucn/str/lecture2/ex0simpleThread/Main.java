package edu.tucn.str.lecture2.ex0simpleThread;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class Main {
    public static void main(String[] args) {
        new MyThread().start(); // Thread-0
        new MyThread().start(); // Thread-1
        new MyThread().run(); // this is executed by the main thread!!!

        // this is how you start a thread based on a Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
