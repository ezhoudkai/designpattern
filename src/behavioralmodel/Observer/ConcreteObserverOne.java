package behavioralmodel.Observer;

public class ConcreteObserverOne implements AbstractObserver{
    @Override
    public void response() {
        System.out.println("具体观察者1做出了反应");
    }
}
