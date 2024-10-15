public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public void visit(Book book) {
        int cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost = " + cost);
    }

    @Override
    public void visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
    }
}
