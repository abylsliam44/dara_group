import java.util.ArrayList;
import java.util.List;

// Вместо Memento используем Snapshot
class Snapshot {
    private String state;

    public Snapshot(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Snapshot saveState() {
        return new Snapshot(state);
    }

    public void restoreState(Snapshot snapshot) {
        this.state = snapshot.getState();
    }

    public void showState() {
        System.out.println("Current state: " + state);
    }
}

class Caretaker {
    private List<Snapshot> snapshots = new ArrayList<>();

    public void addSnapshot(Snapshot snapshot) {
        snapshots.add(snapshot);
    }

    public Snapshot getSnapshot(int index) {
        return snapshots.get(index);
    }
}

public class SnapshotPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addSnapshot(originator.saveState());

        originator.setState("State 2");
        caretaker.addSnapshot(originator.saveState());

        originator.setState("State 3");

        originator.restoreState(caretaker.getSnapshot(0));
        originator.showState();

        originator.restoreState(caretaker.getSnapshot(1));

        originator.showState();
    }
}
