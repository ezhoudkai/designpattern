package behavioralmodel.Observer;

public class Client {

    public static void main(String[] args) {
        AbstractObserver observerOne = new ConcreteObserverOne();
        AbstractObserver observerTwo = new ConcreteObserverTwo();
        AbstractSubject subject = new ConcreteSubject();
        subject.add(observerOne);
        subject.add(observerTwo);

        subject.notifyObserver();
    }

}
