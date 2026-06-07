public class Animal {
    private String name;
    private String type;
    private int age;

    public Animal() {

    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String value) {
        if (value != null && value.length() > 0) {
            this.name = value;
            System.out.println("Name set to " + value);
        } else {
            System.out.println("Invalid name!");
        }
    }

    public void setType(String value) {
        if (value != null && value.length() > 0) {
            this.type = value;
            System.out.println("Type set to " + value);
        } else {
            System.out.println("Invalid type!");
        }
    }

    public void setAge(int value) {
        if (value > 0 && value <= 50) {
            this.age = value;
            System.out.println("Age set to " + value);
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void fazerSom() {
        System.out.println(this.name + "faz: som genérico!");
    }

    public void showInfo() {
        System.out.println("\n========== ANIMAL INFO ==========");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Age: " + this.age);
    }
}
