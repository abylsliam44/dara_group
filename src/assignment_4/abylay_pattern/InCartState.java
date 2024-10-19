package assignment_4.abylay_pattern;

public class InCartState implements State {
    @Override
    public void handleRequest(Clothing clothing) {
        System.out.println("The clothing item is in your cart. Proceed to purchase.");
        clothing.setState(new PurchasedState());
    }

    @Override
    public String toString() {
        return "in your cart";
    }
}