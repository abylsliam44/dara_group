public interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
