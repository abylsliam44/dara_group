package assignment_2;
// Abstract Product A
interface Chair {
    void sitOn();
}

// Abstract Product B
interface Table {
    void use();
}

// Concrete Product A1
class VictorianChair implements Chair {
    @Override
    public void sitOn()

    {
        System.out.println("Sitting on a Victorian Chair.");
    }
}

// Concrete Product A2
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }
}

// Concrete Product B1
class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a Victorian Table.");
    }
}

// Concrete Product B2
class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a Modern Table.");
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

// Concrete Factory 1
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

// Concrete Factory 2
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

// Client Code
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Creating Victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.sitOn();
        victorianTable.use();

        // Creating Modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();
        modernTable.use();
    }
}



