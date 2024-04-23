package Apr16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        try (Connection c = MySqlConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "INSERT INTO users (name, email) VALUES (?, ?) RETURNING *"
             )) {
            String name = "Jay Vince Serato";
            String email = "";
            statement.setString(1, name);
            statement.setString(2, email);
            int rowsInsert = statement.executeUpdate();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name2 = resultSet.getString("name");
                String email2 = resultSet.getString("email");
                System.out.println("ID: "  + id + "\nName: " + name2 + "\nEmail: " + email2);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
