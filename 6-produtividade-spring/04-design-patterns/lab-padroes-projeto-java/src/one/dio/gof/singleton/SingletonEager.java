package one.dio.gof.singleton;

/**
 * Singleton "Apressado"
 *
 * @author JohnAndante
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
