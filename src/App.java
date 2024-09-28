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