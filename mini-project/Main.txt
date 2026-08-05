import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tentando conectar...");
        ProdutoDAO dao = new ProdutoDAO();
        System.out.println("Se chegou aqui, conectou!");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Inserir Produto");
            System.out.println("2. Ver Todos os Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Produto");
            System.out.println("5. Deletar Produto");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n===== INSERIR PRODUTO =====");
                    System.out.println("Nome: ");
                    String nome = teclado.nextLine();

                    System.out.println("Preço: R$ ");
                    double preco = teclado.nextDouble();

                    System.out.println("Quantidade: ");
                    int quantidade = teclado.nextInt();

                    Produto p = new Produto(0, nome, preco, quantidade);
                    dao.inserir(p);
                    break;

                case 2:
                    System.out.println("\n ===== TODOS OS PRODUTOS =====");
                    ArrayList<Produto> produtos = dao.buscarTodos();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto encontrado!");
                    } else {
                        for (Produto prod : produtos) {
                            System.out.println(prod);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n ===== BUSCAR POR ID =====");
                    System.out.println("ID do produto");
                    int id = teclado.nextInt();

                    Produto produto = dao.buscarPorId(id);
                    if (produto != null) {
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== ATUALIZAR PRODUTO =====");
                    System.out.println("ID do produto: ");
                    int idAtualizar = teclado.nextInt();
                    teclado.nextLine();

                    Produto produtoAtual = dao.buscarPorId(idAtualizar);
                    if (produtoAtual != null) {
                        System.out.println("Novo nome: ");
                        String novoNome = teclado.nextLine();

                        System.out.println("Novo preço: R$ ");
                        double novoPreco = teclado.nextDouble();

                        System.out.println("Nova quantidade: ");
                        int novaQuantidade = teclado.nextInt();

                        Produto produtoAtualizado = new Produto(idAtualizar, novoNome, novoPreco, novaQuantidade);
                        dao.atualizar(produtoAtualizado);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("\n===== DELETAR PRODUTO =====");
                    System.out.println("ID do produto: ");
                    int idDeletar = teclado.nextInt();
                    dao.deletar(idDeletar);
                    break;

                case 6:
                    continuar = false;
                    System.out.println("\n Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        dao.fecharConexao();
        teclado.close();

    }
}
