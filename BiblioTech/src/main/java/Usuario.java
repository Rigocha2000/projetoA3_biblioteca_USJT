public class Usuario {
    
    private int id;
    private String nome;
    private String sexo;
    private int idade;
    private String login;
    private String senha;
    private String email;
    private String fav1;
    private String fav2;
    private boolean admin;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, String sexo, int idade, String login, String senha, String email,
            String fav1, String fav2, boolean admin) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.fav1 = fav1;
        this.fav2 = fav2;
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