package Apr16;

//import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/dbcsit228f3";
    private static final String USERNAME = "root2";
    private static final String PASSWORD = "randomstuff";
    public static Connection getConnection() throws SQLException {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties props = new Properties();
//            props.put("autoCommit", "false");
            c = DriverManager.getConnection(URL);
            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return c;
    }


}
