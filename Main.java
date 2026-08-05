import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro carroUsuario = new Carro();

        System.out.println("Digite a marca do carro: ");
        carroUsuario.marca = teclado.nextLine();

        System.out.println("Digite o modelo do carro: ");
        carroUsuario.modelo = teclado.nextLine();

        System.out.println("Digite o ano do carro: ");
        carroUsuario.ano = teclado.nextInt();

        System.out.println("\n--- Dados do veículo ---");
        carroUsuario.exibirDados();

        carroUsuario.acelerar(50);
        carroUsuario.acelerar(30);

        teclado.close();

    }
}