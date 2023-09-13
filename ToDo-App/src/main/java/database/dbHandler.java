package database;
import java.sql.*;
public class dbHandler extends configs{

    Connection dbConnection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String ConnectString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" +dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(ConnectString, dbUser , dbPassword);

        return dbConnection;
    }



}
