package assignment_4.abylay_pattern;

public class Clothing {
    private State state;
    private String name;

    public Clothing(String name, State initialState) {
        this.name = name;
        this.state = initialState; // начальное состояние
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }

    public String getName() {
        return name;
    }

    public void displayState() {
        System.out.println("Clothing item " + name + " is currently: " + state.toString());
    }

    public State getState() {
        return state;
    }
}