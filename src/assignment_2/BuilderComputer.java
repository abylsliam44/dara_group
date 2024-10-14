package assignment_2;
public class BuilderComputer {

    // Вложенный класс Product: Компьютер
    public static class Computer {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public Computer(String CPU, String GPU, int RAM, int storage) {
            this.CPU = CPU;
            this.GPU = GPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        @Override
        public String toString() {
            return "Computer with CPU: " + CPU + ", GPU: " + GPU + ", RAM: " + RAM + " GB, Storage: " + storage + " GB";
        }
    }

    // Вложенный класс Builder: Строитель компьютера
    public static class ComputerBuilder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(CPU, GPU, RAM, storage);
        }
    }

    // Вложенный класс Director: Управляющий процессом сборки
    public static class ComputerDirector {
        private ComputerBuilder builder;

        public ComputerDirector(ComputerBuilder builder) {
            this.builder = builder;
        }

        public Computer constructGamingPC() {
            return builder
                    .setCPU("Intel Core i9")
                    .setGPU("NVIDIA RTX 3080")
                    .setRAM(32)
                    .setStorage(2000)
                    .build();
        }

        public Computer constructOfficePC() {
            return builder
                    .setCPU("Intel Core i5")
                    .setGPU("Integrated Graphics")
                    .setRAM(8)
                    .setStorage(500)
                    .build();
        }
    }

    // Основной метод main, который использует все вложенные классы
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        Computer gamingPC = director.constructGamingPC();
        System.out.println(gamingPC);

        Computer officePC = director.constructOfficePC();
        System.out.println(officePC);
    }
}
