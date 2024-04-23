package Apr16;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        try (Connection c = MySqlConnection.getConnection();
             Statement statement = c.createStatement()){
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.getInt("id");
            while (resultSet.next()) {
                int wala = resultSet.findColumn("wala dinha");
                System.out.println("Wala :"  + wala);
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: "  + id + "\nName: " + name + "\nEmail: " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
