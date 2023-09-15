package database;
import java.io.FileNotFoundException;
import java.sql.*;
public class dbHandler extends configs{

    Connection dbConnection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String ConnectString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" +dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(ConnectString, dbUser , dbPassword);

        return dbConnection;
    }

    //signup user
    public void signUp(String firstname, String lastname, String username,  String password, String gender){
        String insert = "INSERT INTO " + constant.USER_TABLE + "("+ constant.USER_FIRSTNAME +","+ constant.USER_LASTNAME +","+ constant.USER_USERNAME +
               ","+ constant.USER_PASSWORD +","+ constant.USER_GENDER + ")" + "VALUES(?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = getConnection().prepareStatement(insert);

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, gender);

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }

}
