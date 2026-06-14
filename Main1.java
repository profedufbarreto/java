import java.util.Scanner;

public class Main1 {

    public static void saudacao(String nome) {
        System.out.println("Olá " + nome);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        saudacao(nome);

        teclado.close();
    }
}
