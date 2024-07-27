package one.dio.gof.strategy;

public class Robot {

    private Behaviour behaviour;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void setBehaviour(Behaviour strategy) {
        this.behaviour = strategy;
    }

    public void mover() {
        behaviour.mover();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "behaviour=" + behaviour +
                ", name='" + name + '\'' +
                '}';
    }


}
