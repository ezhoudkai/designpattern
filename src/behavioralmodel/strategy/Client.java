package behavioralmodel.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        AbstractStrategy strategyOne = new ConcreteStrategyOne();
        context.setAbstractStrategy(strategyOne);
        context.strategyMethod();
    }

}
