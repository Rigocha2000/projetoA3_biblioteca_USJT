import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AvaliacaoDAO {

    AvaliacaoDAO() {

    }

    public boolean existeAvaliacao(Avaliacao avaliacao) throws Exception {

        String sql = "SELECT * FROM tb_avaliacao WHERE FK_IdLivro = ? AND FK_IdUser = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, avaliacao.getFk_IdLivro());
            ps.setInt(2, avaliacao.getFk_IdUser());

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        }
    }

    public boolean cadastrar(Avaliacao avaliacao) throws Exception {

        boolean result = false;

        if (existeAvaliacao(avaliacao)) {

            String sql = "UPDATE tb_avaliacao SET nota = ? WHERE idUser = ? AND idLivro = ?";

            try (Connection c = ConnectionFactory.obtemConexao();
                    PreparedStatement ps = c.prepareStatement(sql)) {

                ps.setDouble(1, avaliacao.getNota());
                ps.setInt(2, avaliacao.getFk_IdUser());
                ps.setInt(3, avaliacao.getFk_IdLivro());

                int i = ps.executeUpdate();

                if (i > 0) {
                    result = true;
                }
            } catch (Exception e) {
                result = false;
                
            }

        } else {

            // definir comando SQL
            String sql = "INSERT INTO tb_avaliacao (nota, fk_IdLivro, fk_IdUser) VALUES (?, ?, ?)";

            // abrir conexão como recurso do try
            try (Connection c = ConnectionFactory.obtemConexao()) {
                // pre compilar o comando SQL
                PreparedStatement ps = c.prepareStatement(sql);
                // preencher com valores o statement SQL
                ps.setDouble(1, avaliacao.getNota());
                ps.setDouble(2, avaliacao.getFk_IdLivro());
                ps.setInt(3, avaliacao.getFk_IdUser());
                // executa o comando
                ps.execute();

                LivroDAO lvDAO = new LivroDAO();
                lvDAO.atualizarNotaMedia(avaliacao);
                result = true;
            } catch (Exception e) {
                e.printStackTrace();
                result = false;
            }
        }

        return result;
        
    }

}
