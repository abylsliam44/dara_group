// File name: OrderProcessingAndInvoiceSystem.java

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}

class Order {
    private String product;
    private int quantity;

    public Order(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

class OrderProcessor {
    private PaymentProcessor paymentProcessor;

    public OrderProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        System.out.println("Processing order for " + order.getProduct());
        double amount = calculateTotal(order);
        paymentProcessor.processPayment(amount);
    }

    private double calculateTotal(Order order) {
        return order.getQuantity() * 10.0;
    }
}

interface InvoiceGenerator {
    void generateInvoice(Order order);
}

class PDFInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(Order order) {
        System.out.println("Generating PDF invoice for order: " + order.getProduct());
    }
}

class OrderService {
    private OrderProcessor orderProcessor;
    private InvoiceGenerator invoiceGenerator;

    public OrderService(OrderProcessor orderProcessor, InvoiceGenerator invoiceGenerator) {
        this.orderProcessor = orderProcessor;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void process(Order order) {
        orderProcessor.processOrder(order);
        invoiceGenerator.generateInvoice(order);
    }
}

public class OrderProcessingAndInvoiceSystem {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 2);
        PaymentProcessor paymentProcessor = new PayPalPaymentProcessor();
        InvoiceGenerator invoiceGenerator = new PDFInvoiceGenerator();
        OrderProcessor orderProcessor = new OrderProcessor(paymentProcessor);
        OrderService orderService = new OrderService(orderProcessor, invoiceGenerator);
        orderService.process(order);
    }
}
