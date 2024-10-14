// Strategy Interface
interface OperationStrategy {
    int execute(int a, int b);
}
//нем бар еды айтуга тусып СДУ га тусе салу керек ед збзб

class AddStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class SubtractStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

// Context Class
class Calculator {
    private OperationStrategy strategy;

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.execute(a, b);
    }
}

// Client Code
public class StrategyPattern {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Use add strategy
        calculator.setStrategy(new AddStrategy());
        System.out.println("10 + 5 = " + calculator.calculate(10, 5));

        // Use subtract strategy
        calculator.setStrategy(new SubtractStrategy());
        System.out.println("10 - 5 = " + calculator.calculate(10, 5));
    }
}
