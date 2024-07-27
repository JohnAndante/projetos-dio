package one.dio.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author JohnAndante
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
