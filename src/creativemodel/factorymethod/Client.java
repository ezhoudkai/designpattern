package creativemodel.factorymethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        AbstractProduct appleProduct;

        appleProduct = appleFactory.getProduct();
        appleProduct.show();

    }
}
