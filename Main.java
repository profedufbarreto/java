import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("===== ENTER DOG DATA =====");

        Dog dog = new Dog();

        System.out.println("Enter dog name: ");
        String dogName = teclado.nextLine();
        dog.setName(dogName);

        System.out.println("Enter type (Dog): ");
        String dogType = teclado.nextLine();
        dog.setType(dogType);

        System.out.println("Enter breed: ");
        String dogBreed = teclado.nextLine();
        dog.setBreed(dogBreed);

        System.out.println("Enter age: ");
        int dogAge = teclado.nextInt();
        dog.setAge(dogAge);

        dog.showInfo();

        dog.fazerSom();

        teclado.nextLine();

        System.out.println("\n===== ENTER CAT DATA =====");
        Cat cat = new Cat();

        System.out.println("Enter cat name: ");
        String catName = teclado.nextLine();
        cat.setName(catName);

        System.out.println("Enter type (Cat): ");
        String catType = teclado.nextLine();
        cat.setType(catType);

        System.out.println("Enter breed: ");
        String catBreed = teclado.nextLine();
        cat.setBreed(catBreed);

        System.out.println("Enter age: ");
        int catAge = teclado.nextInt();
        cat.setAge(catAge);

        cat.showInfo();
        cat.fazerSom();

        teclado.close();
    }
}