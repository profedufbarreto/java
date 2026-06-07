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
    }
}