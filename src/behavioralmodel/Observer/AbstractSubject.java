package behavioralmodel.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {

    List<AbstractObserver> abstractObservers = new ArrayList<AbstractObserver>();

    void add(AbstractObserver abstractObserver){
            abstractObservers.add(abstractObserver);
    }

    void remove(AbstractObserver abstractObserver){
            abstractObservers.remove(abstractObserver);
    }

    abstract void notifyObserver();

}
