package Apr16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        try (Connection c = MySqlConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "DELETE FROM users WHERE email=? RETURNING *"
             )){
//            int id = 2;
//            statement.setInt(1, id);
            String default_email = "";
            statement.setString(1, default_email);
            int rowsDeleted = statement.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                int id2 = resultSet.getInt("id");
                String name2 = resultSet.getString("name");
                String email2 = resultSet.getString("email");
                System.out.println("ID: "  + id2 + "\nName: " + name2 + "\nEmail: " + email2);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
