package structuralmodel.adapter;

public class Client {

    public static void main(String[] args) {
        Target adapterOne = new AdapterOne();
        adapterOne.request();
        Target adapterTwo = new AdapterTwo();
        adapterTwo.request();
    }

}
