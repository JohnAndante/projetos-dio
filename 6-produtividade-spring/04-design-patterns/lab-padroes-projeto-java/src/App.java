import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.AgressiveBehaviour;
import one.dio.gof.strategy.Behaviour;
import one.dio.gof.strategy.DefaultBehaviour;
import one.dio.gof.strategy.DefensiveBehaviour;
import one.dio.gof.strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {

        // Testes de Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Lazy 1: " + lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println("Lazy 2: " + lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Lazy Holder 1: " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Lazy Holder 2: " + lazyHolder);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("Eager 1: " + eager);
        eager = SingletonEager.getInstance();
        System.out.println("Eager 2: " + eager);

        // Testes de Strategy
        Behaviour defaultBehaviour = new DefaultBehaviour();
        Behaviour defensiveBehaviour = new DefensiveBehaviour();
        Behaviour agressiveBehaviour = new AgressiveBehaviour();

        Robot robot = new Robot("R2D2");

        robot.setBehaviour(defaultBehaviour);
        System.out.println(robot);
        robot.mover();

        robot.setBehaviour(defensiveBehaviour);
        System.out.println(robot);
        robot.mover();

        robot.setBehaviour(agressiveBehaviour);
        System.out.println(robot);
        robot.mover();

        // Teste de Facade
        Facade facade = new Facade();
        facade.migrateCustomer("John", "12345678");
        facade.migrateCustomer("Doe", "87654321");
        facade.migrateCustomer("Josias", "1123323");

    }
}
