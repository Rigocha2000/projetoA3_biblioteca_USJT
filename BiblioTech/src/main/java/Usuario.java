
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    
    private int id;
    private String Nome;
    private String Sexo;
    private int Idade;
    private String Login;
    private String Senha;
    private String Email;
    private boolean FavRomance = false ;
    private boolean FavFiccao = false ;
    private boolean FavTecnico = false ;
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String Login) {
        this.Login = Login;
    }

    public Usuario(String Nome, String Sexo, int Idade, String Login, String Senha, String Email, boolean admin) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Login = Login;
        this.Senha = Senha;
        this.Email = Email;
        this.admin = admin;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isFavRomance() {
        return FavRomance;
    }

    public void setFavRomance(boolean FavRomance) {
        this.FavRomance = FavRomance;
    }

    public boolean isFavFiccao() {
        return FavFiccao;
    }

    public void setFavFiccao(boolean FavFiccao) {
        this.FavFiccao = FavFiccao;
    }

    public boolean isFavTecnico() {
        return FavTecnico;
    }

    public void setFavTecnico(boolean FavTecnico) {
        this.FavTecnico = FavTecnico;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }



    //@Override
    // public String toString() {
    //     return "Usuario{" + "id="+id+ ", nome="+nome+  ", login="+login+", senha="+senha+ ", email="+email+ ", idade="+idade+ ", sexo="+sexo+ ", favorito1="+fav1+ ", favorito2="+fav2+ ", admin="+admin+  "}";
    // }
    public boolean cadastrar () {
        //definir comando SQL
        String sql = "INSERT INTO Usuario (Login, Senha, Email) VALUES (?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, Login);
            ps.setString(2, Senha);
            ps.setString(3, Email);
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