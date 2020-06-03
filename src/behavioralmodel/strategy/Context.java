package behavioralmodel.strategy;

public class Context {

    private AbstractStrategy abstractStrategy;

    public AbstractStrategy getAbstractStrategy() {
        return abstractStrategy;
    }

    public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
        this.abstractStrategy = abstractStrategy;
    }

    public void strategyMethod(){
        abstractStrategy.sayStrategy();
    }
}
