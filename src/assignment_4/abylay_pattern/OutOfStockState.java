package assignment_4.abylay_pattern;

public class OutOfStockState implements State {
    @Override
    public void handleRequest(Clothing clothing) {
        System.out.println("The clothing item is out of stock.");
    }

    @Override
    public String toString() {
        return "out of stock";
    }
}
