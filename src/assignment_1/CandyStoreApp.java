package assignment_1;

import java.util.List;
import java.util.Arrays;

 interface Candy {
    String getName();
    double getPrice();
}

class Lollipop implements Candy {
    @Override
    public String getName() {
        return "Lollipop";
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}

class Marshmallow implements Candy {
    @Override
    public String getName() {
        return "Marshmallow";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}

class CandyStore {
    private List<Candy> candyInventory;

    public CandyStore(List<Candy> candyInventory) {
        this.candyInventory = candyInventory;
    }

    public void displayCandy() {
        for (Candy candy : candyInventory) {
            System.out.println(candy.getName() + ": $" + candy.getPrice());
        }
    }

    public double calculateTotalCost() {
        return candyInventory.stream().mapToDouble(Candy::getPrice).sum();
    }
}
//skibidi toilet
public class CandyStoreApp {
    public static void main(String[] args) {
        List<Candy> candies = Arrays.asList(new Lollipop(), new Marshmallow());
        CandyStore store = new CandyStore(candies);

        store.displayCandy();
        System.out.println("Total cost: $" + store.calculateTotalCost());
    }
}
