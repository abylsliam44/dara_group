
interface Iterator {
    boolean hasNext();
    int next();
}

//киын боп кеттыго гитпен
class NumberIterator implements Iterator {
    private int[] numbers;
    private int index;

    public NumberIterator(int[] numbers) {
        this.numbers = numbers;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < numbers.length;
    }

    @Override
    public int next() {
        return numbers[index++];
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        NumberIterator iterator = new NumberIterator(numbers);

        while (iterator.hasNext()) {
            System.out.println("Number: " + iterator.next());
        }
    }
}
