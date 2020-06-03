package behavioralmodel.Observer;

public class ConcreteObserverTwo implements AbstractObserver{
    @Override
    public void response() {
        System.out.println("具体观察者2做出了回应");
    }
}
