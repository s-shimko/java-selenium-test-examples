package s.shimko.patterns.behavior.strategy;

public class WalkStrategy implements ActionStrategy {

    @Override
    public void andDo() {
        System.out.println("Walk");
    }
}
