package Apr19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try (Connection c = MySQLConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                "INSERT INTO users (name, email) VALUES (?,?)"
             )) {
            String name = "Jay Vince Serato";
            String email = "jayvince.serato@cit.edu";
            statement.setString(1, name);
            statement.setString(2, email);
            int rows = statement.executeUpdate();
            System.out.println("Rows inserted: " + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
