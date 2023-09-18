package database;
import model.User;

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
    public void signUp(User user){
        String insert = "INSERT INTO " + constant.USER_TABLE + "("+ constant.USER_FIRSTNAME +","+ constant.USER_LASTNAME +","+ constant.USER_USERNAME +
               ","+ constant.USER_PASSWORD +","+ constant.USER_GENDER + ")" + "VALUES(?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = getConnection().prepareStatement(insert);

            preparedStatement.setString(1, user.getFirstname());
            preparedStatement.setString(2, user.getLastname());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getGender());

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }



    }

}
