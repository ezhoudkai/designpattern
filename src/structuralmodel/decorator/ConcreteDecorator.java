package structuralmodel.decorator;

public class ConcreteDecorator extends AbstractDecorator{


    public ConcreteDecorator(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    public void operation(){
        super.operation();
        addOperation();
    }

    private void addOperation() {
            System.out.println("这里是加法，为另外新增的方法");
    }
}
