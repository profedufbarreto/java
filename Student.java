public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String nome, int age, double gpa) {
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setName(String value) {
        if (value != null && value.length() > 0) {
            this.name = value;
            System.out.println("Name set to " + value);
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setAge(int value) {
        if (value >= 0 && value <= 120) {
            this.age = value;
            System.out.println("Age set to " + value);
        } else {
            System.out.println("Invalid age! Must be 0-120");
        }
    }

    public void setGpa(double value) {
        if (value >= 0 && value <= 10) {
            this.gpa = value;
            System.out.println("GPA set to " + value);
        } else {
            System.out.println("Invalid GPA! Must be 0-10");
        }
    }

    public void showInfo() {
        System.out.println("\n========== STUDENT INFO ==========");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("====================================");
    }

}