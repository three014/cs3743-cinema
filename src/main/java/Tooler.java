import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Tooler {
    public static void main(String[] args) {
        SqlDriver.init();

        String url = "jdbc:mysql://127.0.0.1:3306/cinema";
        String user = "/* Replace string with your username */";
        String password = "/* Replace string with your password */";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Do cool stuff with connection
            var ps = conn.prepareStatement("select * from MOVIE");
            var resultSet = ps.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("MOV_TITLE"));
            }

        } catch (SQLException ex) {
            System.err.println(STR."Error in SQL connection: \{ex}");
            System.exit(1);
        }
    }
}
