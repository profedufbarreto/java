public class Motorcycle extends Vehicle {
    private int cc;
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, double price, int year, int cc, boolean hasSidecar) {
        super(brand, model, price, year);
        setCc(cc);
        setHasSidecar(hasSidecar);
    }

    public int getCc() {
        return this.cc;
    }

    public boolean getHasSidecar() {
        return this.hasSidecar;
    }

    public void setCc(int value) {
        if (value >= 50 && value <= 1200) {
            this.cc = value;
            System.out.println("CC set to " + value);
        } else {
            System.out.println("Invalid CC! Must be 50-1200");
        }
    }

    public void setHasSidecar(boolean value) {
        this.hasSidecar = value;
        System.out.println("Sidecar: " + (value ? "Yes" : "No"));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("CC: " + this.cc);
        System.out.println("Has Sidecar: " + (this.hasSidecar ? "Yes" : "No"));
        System.out.println("==============================================\n");
    }
}
