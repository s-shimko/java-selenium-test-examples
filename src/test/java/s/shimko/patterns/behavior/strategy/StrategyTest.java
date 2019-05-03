package s.shimko.patterns.behavior.strategy;

import javax.swing.text.SimpleAttributeSet;

public class StrategyTest {

    private static StrategyContext strategyContext = new StrategyContext();

    public static void main(String[] args) {
        strategyContext.setActionStrategy(new WalkStrategy());
        strategyContext.performStrategy();
        strategyContext.setActionStrategy(new FlyStrategy());
        strategyContext.performStrategy();

    }
}
