package creativemodel.factorymethod;


public class PearFactory implements AbstractFactory{

    @Override
    public AbstractProduct getProduct() {
        return new PearProduct();
    }
}
