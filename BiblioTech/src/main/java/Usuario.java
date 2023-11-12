
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    
    private int id;
    private String nome;
    private String sexo;
    private int idade;
    private String login;
    private String senha;
    private String email;
    private boolean favRomance = false ;
    private boolean favFiccao = false ;
    private boolean favTecnico = false ;
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, String sexo, int idade, String login, String senha, String email,
            boolean favRomance, boolean favFiccao, boolean favTecnico, boolean admin) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.favRomance = favRomance;
        this.favFiccao = favFiccao;
        this.favTecnico = favTecnico;
        this.admin = admin;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFavRomance() {
        return favRomance;
    }

    public void setFavRomance(boolean favRomance) {
        this.favRomance = favRomance;
    }

    public boolean isFavFiccao() {
        return favFiccao;
    }

    public void setFavFiccao(boolean favFiccao) {
        this.favFiccao = favFiccao;
    }

    public boolean isFavTecnico() {
        return favTecnico;
    }

    public void setFavTecnico(boolean favTecnico) {
        this.favTecnico = favTecnico;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", admin=" + admin
                + "]";
    }
    
}