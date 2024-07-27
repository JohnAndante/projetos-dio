package one.dio.gof.strategy;

public class DefaultBehaviour implements Behaviour {
    @Override
    public void mover() {
        System.out.println("Movimento padrão");
    }

    @Override
    public String toString() {
        return "DefaultBehaviour{}";
    }
}
