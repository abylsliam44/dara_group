import java.util.ArrayList;
import java.util.List;

interface Observer {
    void gitgiupdate(String state);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

class ConcreteObserver1 implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserver1: State updated to " + state);
    }
}

class ConcreteObserver2 implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserver2: State updated to " + state);
    }
}

public class ObserverPatternDemo { // main pattern
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
    }
}
