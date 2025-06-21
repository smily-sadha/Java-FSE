class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GraphicsCard;

    private Computer(String CPU, String RAM, String storage, String GraphicsCard) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GraphicsCard = GraphicsCard;
    }

    public String toString() {
        return "computer[CPU=" + CPU + ",RAM=" + RAM + ",storage=" + storage + ",GraphicCardEnabled=" + GraphicsCard + "]";
    }

    public static class ComputerBuilder {
        private final String CPU;
        private final String RAM;
        private final String storage;
        private String GraphicsCard = "none";

        public ComputerBuilder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public ComputerBuilder GraphicsCardEnabled(String GraphicsCard) {
            this.GraphicsCard = GraphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(CPU, RAM, storage, GraphicsCard);
        }
    }
}

public class Builderpattern {
    public static void main(String[] args){

        Computer gamingPC = new Computer.ComputerBuilder("high process", "16 GB", "1 TB")
                .GraphicsCardEnabled("8 GB")
                .build();

        System.out.println(gamingPC);
        Computer basicPC = new Computer.ComputerBuilder("medium process", "8 GB", "512 TB")
                .build();

        System.out.println(basicPC);

    }
}