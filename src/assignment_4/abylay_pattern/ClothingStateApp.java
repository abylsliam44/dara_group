package assignment_4.abylay_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClothingStateApp {
    private static List<Clothing> clothingList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        clothingList.add(new Clothing("T-Shirt", new AvailableState()));
        clothingList.add(new Clothing("Jeans", new AvailableState()));
        clothingList.add(new Clothing("Jacket", new OutOfStockState()));
        clothingList.add(new Clothing("Hat", new AvailableState()));
        clothingList.add(new Clothing("Sneakers", new OutOfStockState()));

        while (true) {
            System.out.println("\nSelect a clothing item:");
            for (int i = 0; i < clothingList.size(); i++) {
                System.out.println(i + 1 + " - " + clothingList.get(i).getName());
            }
            System.out.println("0 - Exit");

            int clothingChoice = scanner.nextInt();

            if (clothingChoice == 0) {
                System.out.println("Exiting...");
                break;
            }

            if (clothingChoice < 1 || clothingChoice > clothingList.size()) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            Clothing selectedClothing = clothingList.get(clothingChoice - 1);
            selectedClothing.displayState();

            while (true) {
                System.out.println("\nSelect an action for " + selectedClothing.getName() + ":");
                System.out.println("1 - Add to Cart");
                System.out.println("2 - Purchase");
                System.out.println("3 - Show Current State");
                System.out.println("0 - Back to clothing selection");

                int actionChoice = scanner.nextInt();

                switch (actionChoice) {
                    case 1:
                        if (selectedClothing.getState() instanceof AvailableState) {
                            selectedClothing.request();
                        } else {
                            System.out.println("Item cannot be added to cart. It's not available.");
                        }
                        break;
                    case 2:
                        if (selectedClothing.getState() instanceof InCartState) {
                            selectedClothing.request();
                        } else {
                            System.out.println("You can't purchase this item. It's not in your cart.");
                        }
                        break;
                    case 3:
                        selectedClothing.displayState();
                        break;
                    case 0:
                        System.out.println("Returning to clothing selection...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

                if (actionChoice == 0) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
