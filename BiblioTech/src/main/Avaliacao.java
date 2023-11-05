import java.sql.PreparedStatement;

public class Avaliacao {

    private int id;
    private double Nota;
    private int FK_IdUser;
    private int FK_IdLivro;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getNota() {
        return Nota;
    }
    public void setNota(double nota) {
        Nota = nota;
    }
    public int getFK_IdUser() {
        return FK_IdUser;
    }
    public void setFK_IdUser(int fK_IdUser) {
        FK_IdUser = fK_IdUser;
    }
    public int getFK_IdLivro() {
        return FK_IdLivro;
    }
    public void setFK_IdLivro(int fK_IdLivro) {
        FK_IdLivro = fK_IdLivro;
    }

    public boolean cadastrar () {
        //definir comando SQL
        String sql = "INSERT INTO Avaliacao (Nota, FK_IdUser, FK_IdLivro) VALUES (?, ?, ?)";
    
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setDouble(1, Nota);
            ps.setInt(2, FK_IdUser);
            ps.setInt(3, FK_IdLivro);
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
