package edu.tucn.str.lecture2.ex0simpleThread;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<15; i++) {
            System.out.printf("[%s] message number: %d\n", Thread.currentThread().getName(), i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
