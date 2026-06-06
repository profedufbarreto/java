public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private int year;

    public Vehicle(String brand, String model, double price, int year) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setYear(year);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String value) {
        if (value != null && value.length() > 0) {
            this.brand = value;
            System.out.println("Brand set to " + value);
        } else {
            System.out.println("Invalid brand!");
        }
    }

    public void setModel(String value) {
        if (value != null && value.length() > 0) {
            this.model = value;
            System.out.println("Model set to " + value);
        } else {
            System.out.println("Invalid model!");
        }
    }

    public void setPrice(double value) {
        if (value > 0) {
            this.price = value;
            System.out.println("Price set to R$: " + value);
        } else {
            System.out.println("Invalid price!");
        }
    }

    public void setYear(int value) {
        if (value >= 1900 && value <= 2026) {
            this.year = value;
            System.out.println("Year set to " + value);
        } else {
            System.out.println("Invalid year!");
        }
    }

    public void showInfo() {
        System.out.println("\n========== VEHICLE INFO ==========");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price R$: " + this.price);
        System.out.println("Year: " + this.year);
    }
}