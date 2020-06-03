package behavioralmodel.strategy;

public class ConcreteStrategyTwo implements AbstractStrategy{
    @Override
    public void sayStrategy() {
        System.out.println("这里是具体的策略2（读书）");
    }
}
