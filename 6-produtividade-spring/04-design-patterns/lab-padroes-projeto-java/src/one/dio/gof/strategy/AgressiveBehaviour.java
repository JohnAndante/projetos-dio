package one.dio.gof.strategy;

public class AgressiveBehaviour implements Behaviour {
    @Override
    public void mover() {
        System.out.println("Movimento agressivo");
    }

    @Override
    public String toString() {
        return "AgressiveBehaviour{}";
    }
}
