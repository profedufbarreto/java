public class Pessoa {

    private String nome;

    public String getNome() {
        System.out.println("Alguém está lendo o nome...");
        return nome;
    }

    public void setNome(String novoNome) {
        System.out.println("Alguém está mudando o nome..");
        nome = novoNome;
    }
}
