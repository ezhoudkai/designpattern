package creativemodel.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factoryOne = new RealOneFactory();
        factoryOne.getAnimal().run();
        factoryOne.getPlant().show();

    }
}
