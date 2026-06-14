import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Você quer fazer a tabuada de qual número: ");
        int tabuada = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println("O resultado de " + tabuada + " x " + i + " = " + resultado);
        }

        teclado.close();
    }
}
