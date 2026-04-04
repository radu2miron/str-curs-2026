package edu.tucn.str.lecture2.ex0simpleThread;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
