package behavioralmodel.templatemethod;

public class Client {

    public static void main(String[] args) {
            AbstractTemplate templateOne = new ConcreteTemplate();
            templateOne.templateMethod();
    }
}
