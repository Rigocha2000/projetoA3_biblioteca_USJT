import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {

    private static String usuario = "avnadmin";
    private static String senha = "AVNS__J0Q2FhQyfAIelpi-aO";
    private static String host = "bibliotech-biblio-tech.a.aivencloud.com";
    private static String porta = "18301";
    private static String bd = "db_biblioteco";

    public static Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                    usuario,
                    senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}