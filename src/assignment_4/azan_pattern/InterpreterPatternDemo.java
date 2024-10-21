package assignment_4.azan_pattern;

// interpreter pattern by azan
interface Expression {
    int interpret();
}


class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}


class Add implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Add(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}


class Subtract implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Subtract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}

public class InterpreterPatternDemo {
    public static void main(String[] args) {

        Expression five = new Number(5);
        Expression ten = new Number(10);
        Expression two = new Number(2);


        Expression add = new Add(five, ten);


        Expression subtract = new Subtract(add, two);


        System.out.println("Result: " + subtract.interpret());
    }
}

