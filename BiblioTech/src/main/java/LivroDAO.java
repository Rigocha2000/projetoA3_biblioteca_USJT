import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LivroDAO {

    public LivroDAO() {
    }

    public Livro getLivro(String titulo, String autor) throws Exception {

        String sql = "SELECT * FROM tb_livro WHERE titulo = ? AND autor = ?";

        Livro livro = new Livro();

        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, titulo);
            ps.setString(2, autor);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    livro.setId(rs.getInt("idLivro"));
                    livro.setGenero(rs.getString("genero"));
                    livro.setNotaMedia(rs.getDouble("notaMedia"));
                    livro.setFk_IdUser(rs.getInt("fk_IdUser"));
                }
            }

        }

        return livro;
    }

    public boolean existeLivro(Livro livro) throws Exception {

        String sql = "SELECT * FROM tb_livro WHERE titulo = ? AND autor = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        }
    }

    public boolean cadastrar(Livro livro) throws Exception {
        // definir comando SQL
        String sql = "INSERT INTO tb_livro (genero, autor, titulo, notaMedia, fk_IdUser) VALUES (?, ?, ?, ?, ?)";

        // abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()) {
            // pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            // preencher com valores o statement SQL
            ps.setString(1, livro.getGenero());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getTitulo());
            ps.setDouble(4, livro.getNotaMedia());
            ps.setInt(5, livro.getFk_IdUser());
            // executa o comando
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean atualizarNotaMedia(Avaliacao avaliacao) throws SQLException {

        Livro livro = new Livro();

        boolean ret = false;

        String sql = "SELECT * FROM tb_avaliacao WHERE fk_IdLivro = ?";
        String sql2 = "SELECT * FROM tb_livro WHERE idLivro = ?";
        String sql3 = "UPDATE tb_livro SET notaMedia = ? WHERE idLivro = ?";
        int size = 0;
        double notaTotal = 0;
        double newNota;

        try (Connection c = ConnectionFactory.obtemConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, avaliacao.getFk_IdLivro());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    notaTotal += rs.getDouble("nota");
                    size++;
                }
            }
        }

        try (Connection conn = ConnectionFactory.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql2)) {

            ps.setInt(1, avaliacao.getFk_IdLivro());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {

                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");

                    try {
                        livro = getLivro(titulo, autor);

                        newNota = notaTotal / size;

                        livro.setNotaMedia(newNota);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        try (Connection c = ConnectionFactory.obtemConexao();
                PreparedStatement ps = c.prepareStatement(sql3)) {

            ps.setDouble(1, livro.getNotaMedia());
            ps.setInt(2, livro.getId());

            int i = ps.executeUpdate();

            if (i > 0) {
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;

    }

}
