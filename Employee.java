public abstract class Employee {
    private String name;
    private double salary;

    public Employee() {

    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String value) {
        if (value != null && value.length() > 0) {
            this.name = value;
            System.out.println("Name set to " + value);
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setSalary(double value) {
        if (value >= 1200) {
            this.salary = value;
            System.out.println(String.format("Salary set to R$ %.2f", value));
        } else {
            System.out.println("Invalid salary! Minimum is R$ 1200");
        }
    }

    public abstract double calculateBonus();

    public void showInfo() {
        System.out.println("\n========== EMPLOYEE INFO ==========");
        System.out.println("Name: " + this.name);
        System.out.println(String.format("Salary: R$ %.2f", this.salary));
        System.out.println(String.format("Bonus: R$ %.2f", calculateBonus()));
    }
}
