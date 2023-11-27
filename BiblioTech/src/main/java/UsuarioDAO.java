import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO tb_usuario (login, senha, email, nome, idade, sexo, fav1, fav2, admin) VALUES (?, ?, ?, ?, ?, ? , ?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getNome());
            ps.setInt(5, usuario.getIdade());
            ps.setString(6, usuario.getSexo());
            ps.setString(7, usuario.getFav1());
            ps.setString(8, usuario.getFav2());
            ps.setBoolean(9, usuario.isAdmin());
            
            //executa o comando
            ps.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        
    }

    public String login (String login, String senha) {

        var sql = "select * from tb_usuario where login = ? and senha = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, login);
            ps.setString(2, senha);

            try(ResultSet auth = ps.executeQuery()) {
                if(auth.next()){

                    int id = auth.getInt("idUser");
                    String nome = auth.getString("nome");
                    String sexo = auth.getString("sexo");
                    int idade = auth.getInt("idade");
                    String email = auth.getString("email");
                    String fav1 = auth.getString("fav1");
                    String fav2 = auth.getString("fav2");
                    Boolean admin = auth.getBoolean("admin");
                    Usuario usuario = new Usuario(nome, sexo, idade, login, senha, email, fav1, fav2, admin);
                    usuario.setId(id);
            
                    if(usuario.isAdmin()){
                        JOptionPane.showMessageDialog(null, "Bem vindo " +usuario.getLogin()+"!");
                        new TelaAdmin().setVisible(true);
                        return "admin";
                    } else {
                        JOptionPane.showMessageDialog(null, "Bem vindo " +usuario.getNome()+ "!");
                        new TelaUsuario(usuario).setVisible(true);
                        return "usuario";
                    }
                
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!");
                    return "incorreto";
                }

            }

        }
        catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

}


