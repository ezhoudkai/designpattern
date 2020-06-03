package creativemodel.abstractfactory;

public class RealOneFactory implements AbstractFactory{
    @Override
    public Animal getAnimal() {
        return new Horse();
    }

    @Override
    public Plant getPlant() {
        return new Rose();
    }
}
