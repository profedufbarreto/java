public class Cat extends Animal {
    private String breed;

    public Cat() {
        super();
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String value) {
        if (value != null && value.length() > 0) {
            this.breed = value;
            System.out.println("Breed set to " + value);
        } else {
            System.out.println("Invalid breed!");
        }
    }

    @Override
    public void fazerSom() {
        System.out.println(this.getName() + "faz: Miaauuu!!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Breed: " = this.breed);
        System.out.println("====================");
    }
}
