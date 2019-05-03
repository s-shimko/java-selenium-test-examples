package s.shimko.patterns.behavior.strategy;

public class FlyStrategy implements ActionStrategy {
    @Override
    public void andDo() {
        System.out.println("Fly");
    }
}
