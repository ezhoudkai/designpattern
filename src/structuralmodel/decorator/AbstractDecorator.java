package structuralmodel.decorator;

public class AbstractDecorator implements AbstractComponent{

    private AbstractComponent abstractComponent;

    public AbstractDecorator(AbstractComponent abstractComponent){
            this.abstractComponent = abstractComponent;
    }

    @Override
    public void operation() {
                abstractComponent.operation();
    }
}
