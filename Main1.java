import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Você quer fazer a tabuada de qual número: ");
        int tabuada = teclado.nextInt();

        int i = 0;
        while (i <= 10) {
            int resultado = tabuada * numbers[i];
            System.out.println("O resultado de: " + tabuada + " x " + numbers[i] + " = " + resultado);
            i++;
        }

        teclado.close();
    }
}
