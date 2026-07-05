import java.sel.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;

public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/loja", 
                "root",
                "root"
                );
        }
    }

}
