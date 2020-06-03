package creativemodel.factorymethod;

public class AppleFactory implements AbstractFactory{


    @Override
    public AbstractProduct getProduct() {
        return new AppleProduct();
    }
}
