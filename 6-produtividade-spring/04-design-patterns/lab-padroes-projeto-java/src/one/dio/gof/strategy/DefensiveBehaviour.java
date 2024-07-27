package one.dio.gof.strategy;

public class DefensiveBehaviour  implements Behaviour {
    @Override
    public void mover() {
        System.out.println("Movimento defensivo");
    }

    @Override
    public String toString() {
        return "DefensiveBehaviour{}";
    }
}
