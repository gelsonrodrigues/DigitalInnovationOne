package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args)  {

        //String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "password";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String urlConnection = sb.toString();

        //Neste try/catch o finally é executado automaticamente fechando a conexão se necessário
        //Trial with resources
        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "password")) {
            System.out.println("Conectado com o digital_innovation_one");
        } catch (SQLException throwables) {
            System.out.println("Falha ao conectar com o digital_innovation_one");
        }
    }
}
