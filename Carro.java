public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade = 0;

    public void exibirDados() {
        System.out.println("Carro: " + marca + " " + modelo + " | Ano: " + ano);
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("O " + modelo + " acelerou para " + velocidade + " km/h!");
    }
}
