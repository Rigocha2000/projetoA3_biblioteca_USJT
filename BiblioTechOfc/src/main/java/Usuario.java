
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    
    private int id;
    private int idade;
    
    private String login;
    private String senha;
    private String nome;
    private String sexo;
    private String email;
    private String fav1;
    private String fav2;
    
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(int id, int idade, String login, String senha, String nome, String sexo, String email, String fav1, String fav2, boolean admin) {
        this.id = id;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.fav1 = fav1;
        this.fav2 = fav2;
        this.admin = admin;
    }

    public String getFav1() {
        return fav1;
    }

    public void setFav1(String fav1) {
        this.fav1 = fav1;
    }

    public String getFav2() {
        return fav2;
    }

    public void setFav2(String fav2) {
        this.fav2 = fav2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id="+id+ ", nome="+nome+  ", login="+login+", senha="+senha+ ", email="+email+ ", idade="+idade+ ", sexo="+sexo+ ", favorito1="+fav1+ ", favorito2="+fav2+ ", admin="+admin+  "}";
    }
    
    public boolean cadastrar () {
        //definir comando SQL
        String sql = "INSERT INTO tb_login (login, senha, email) VALUES (?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.setString(3, email);
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