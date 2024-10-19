package assignment_4.abylay_pattern;

public class AvailableState implements State {
    @Override
    public void handleRequest(Clothing clothing) {
        System.out.println("The clothing item is available for sale. You can add it to your cart.");
        clothing.setState(new InCartState());
    }

    @Override
    public String toString() {
        return "available for sale";
    }
}