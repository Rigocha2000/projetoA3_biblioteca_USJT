import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LivroDAO {
    
    public LivroDAO() {
    }

    public boolean existeLivro(Livro livro) throws Exception {

        String sql = "SELECT * FROM tb_livro WHERE titulo = ? AND autor = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());

            try(ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        }
    } 

    public boolean cadastrar(Livro livro) throws Exception {
        //definir comando SQL
        String sql = "INSERT INTO tb_livro (genero, autor, titulo, notaMedia) VALUES (?, ?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, livro.getGenero());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getTitulo());
            ps.setDouble(4, livro.getNotaMedia());
            // ps.setInt(5, livro.getFk_IdUser());
            //executa o comando
            ps.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        
    }


}
