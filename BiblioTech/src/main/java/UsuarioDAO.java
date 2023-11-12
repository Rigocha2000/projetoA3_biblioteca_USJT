import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public UsuarioDAO() {
    }

    public boolean existeUsuario (Usuario usuario) throws Exception {

        String sql = "SELECT * FROM tb_usuario WHERE login = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, usuario.getLogin());

            try(ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        }
    } 

    public boolean cadastrar(Usuario usuario) throws Exception {
        //definir comando SQL
        String sql = "INSERT INTO tb_usuario (login, senha, email, admin) VALUES (?, ?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setBoolean(4, usuario.isAdmin());
            
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


