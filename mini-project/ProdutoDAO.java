import java.sel.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/loja",
                    "root",
                    "root");
            System.out.println("Conectado ao banco de dados!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public ArrayList<Produto> buscarTodos(){
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try(Statement stmt = conexao.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Produto p = new Produto(
                    rs.getInt("id");
                    rs.getString("nome");
                    rs.getdouble("preco");
                    rs.getInt("quantidade");
                );
                produtos.add(p);
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
        return produtos;
    }

    public Produto buscarPorId(int id){
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Produto(
                    rs.getInt("id");
                    rs.getString("nome");
                    rs.getDouble("preco");
                    rs.getInt("quantidade");
                );
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
        return null;
    }

    public void atualizar(Produto produto) {
        String sql = "UPDATE produtos SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, produto.getNome());
            pstmt.setDouble(2, produto.getPreco());
            pstmt.setInt(3, produto.setQuantidade());
            pstmt.setInt(4, produto.getId());
            pstmt.executeUpdate();
            System.out.println("Produto atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }

    public void deletar(int id){
        String sql = "DELETE FROM produtos WHERE id = ?";
        try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Produto deletado com sucesso!");
        }cacth(SQLException e){
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }

    public void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
                System.out.println("Conexão fechada!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar: " + e.getMessage());
        }
    }

}
