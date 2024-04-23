package Apr16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        try (Connection c = MySqlConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "UPDATE users SET email=? WHERE email=?"
             )) {
//            int new_id = 9;
//            int from_id = 8;
//            statement.setInt(1, new_id);
//            statement.setInt(2, from_id);
            String default_email = "email@email.com";
            String from_email = "";
            statement.setString(1, default_email);
            statement.setString(2, from_email);
            int rowsUpdated = statement.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
