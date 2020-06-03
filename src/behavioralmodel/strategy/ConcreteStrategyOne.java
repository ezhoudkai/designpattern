package behavioralmodel.strategy;

public class ConcreteStrategyOne implements AbstractStrategy{
    @Override
    public void sayStrategy() {
        System.out.println("这里是具体的策略1（写作）");
    }
}
