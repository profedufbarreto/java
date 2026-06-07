public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, String model, double price, int year, int doors, String fuelType) {
        super(brand, model, price, year);
        setDoors(doors);
        setFuelType(fuelType);
    }

    public int getDoors() {
        return this.doors;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setDoors(int value) {
        if (value >= 2 && value <= 5) {
            this.doors = value;
            System.out.println("✅ Doors set to " + value);
        } else {
            System.out.println("❌ Invalid doors! Must be 2-5");
        }
    }

    public void setFuelType(String value) {
        if (value.equals("Gasoline") || value.equals("Diesel") || value.equals("Hybrid")) {
            this.fuelType = value;
            System.out.println("✅ Fuel type set to " + value);
        } else {
            System.out.println("❌ Invalid fuel type!");
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Doors: " + this.doors);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("===================================\n");
    }
}