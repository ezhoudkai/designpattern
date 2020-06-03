package behavioralmodel.Observer;

public class ConcreteSubject extends AbstractSubject{
    @Override
    void notifyObserver() {
        System.out.println("具体主题类发生变化了");
        System.out.println("-----------以下-----------");

        for (Object obj : abstractObservers){
            ((AbstractObserver)obj).response();
        }

    }
}
