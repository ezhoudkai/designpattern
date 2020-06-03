package structuralmodel.decorator;

public class Client {

    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        component.operation();
        System.out.println("以上是未装饰前的组件");
        System.out.println("----------------------------");
        AbstractComponent afterDecorator = new ConcreteDecorator(component);
                afterDecorator.operation();
    }
}
