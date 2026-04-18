package edu.tucn.str.lecture3.ex9syncSingleton;

/**
 * @author <a href="mailto:radu.miro@aut.utcluj.ro">Radu Miron</a>
 */

public class MySingleton {
    private volatile static MySingleton instance;

    private MySingleton() {}

    public static MySingleton getInstance() {
        synchronized (MySingleton.getInstance()) {
            if (instance == null) {
                instance = new MySingleton();
            }
        }

        return instance;
    }
}
