package s.shimko.patterns.behavior.strategy;

public class StrategyContext {

    private ActionStrategy actionStrategy;

    public ActionStrategy getActionStrategy() {
        return actionStrategy;
    }

    public void setActionStrategy(ActionStrategy actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    public void performStrategy(){
        actionStrategy.andDo();
    }
}
