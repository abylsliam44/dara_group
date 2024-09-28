public interface Engine {
    void start();
}

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

public interface Vehicle {
    void drive();
}

public class Car implements Vehicle {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class App {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Vehicle car1 = new Car(petrolEngine);
        car1.drive();

        Engine electricEngine = new ElectricEngine();
        Vehicle car2 = new Car(electricEngine);
        car2.drive();
    }
}