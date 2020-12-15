package utility;

import java.sql.*;

public class DBUtility {


    private final  static String url = ConfigReader.get("JDBC_URL"),
            username =ConfigReader.get("JDBC_UserName"),
            password = ConfigReader.get("JDBC_PassWord");

    private static Connection connection;
    private static Statement statement;

    public static DatabaseMetaData metadata;

    static {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            metadata = connection.getMetaData();
        }catch(Exception e) { }

    }

    public static ResultSet getResult(String sql) {
        // creates the result

        ResultSet result = null;

        try {
            result = statement.executeQuery(sql);

        }catch(Exception e) {}

        return result;
    }



    public static void tearDown() {
        // closes the connection at the last step
        try {
            connection.close();
        }catch(Exception e) { }

    }


    public static void UpdateQuery(String sql) {
        // INSERT, UPDATE, , DELETE, ALTER, TRUNCATE, DROP

        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {

        }
    }


}
