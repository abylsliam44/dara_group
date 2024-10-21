public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        for (ItemElement item : items) {
            item.accept(visitor);
        }
    }
}
