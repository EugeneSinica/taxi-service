package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL =
            "jdbc:mysql://localhost:3306/DATABASE NAME?serverTimezone=UTC";
    //where DATABASE NAME is your scheme name
    private static final String USERNAME = "MySQL USERNAME";
    private static final String PASSWORD = "mySQL PASSWORD";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; //if you are using MYSQL

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}
