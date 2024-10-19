package assignment_4.abylay_pattern;

public class PurchasedState implements State {
    @Override
    public void handleRequest(Clothing clothing) {
        System.out.println("You have purchased the clothing item.");
        clothing.setState(new OutOfStockState());
    }

    @Override
    public String toString() {
        return "purchased";
    }
}
