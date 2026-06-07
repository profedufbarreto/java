public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXAMPLE 1: Objects with parameters (ready) =====");

        Car car1 = new Car("Toyota", "Corolla", 150000, 2020, 4, "Hybrid");
        car1.showInfo();

        System.out.println("===== Motorcycle ======");
        Motorcycle moto = new Motorcycle("Honda", "CB 500", 25000, 2021, 500, false);
        moto.showInfo();
    }
}