import java.sql.Connection;
import java.sql.PreparedStatement;

public class Avaliacao {

    private int id;
    private double nota;
    private int fk_IdUser;
    private int fk_IdLivro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFk_IdUser() {
        return fk_IdUser;
    }

    public void setFk_IdUser(int fk_IdUser) {
        this.fk_IdUser = fk_IdUser;
    }

    public int getFk_IdLivro() {
        return fk_IdLivro;
    }

    public void setFk_IdLivro(int fk_IdLivro) {
        this.fk_IdLivro = fk_IdLivro;
    }

    @Override
    public String toString () {
        return Double.toString(this.nota);
    }

    public boolean cadastrar () {

        //definir comando SQL
        String sql = "INSERT INTO Avaliacao (Nota, FK_IdUser, FK_IdLivro) VALUES (?, ?, ?)";
    
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setDouble(1, nota);
            ps.setInt(2, fk_IdUser);
            ps.setInt(3, fk_IdLivro);
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
