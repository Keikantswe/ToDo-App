package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.cj.protocol.Resultset;
import database.dbHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.User;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXPasswordField txtPassWord;

    private dbHandler dbHandler;
    @FXML
    void initialize() {

        dbHandler = new dbHandler();

        btnSignUp.setOnAction(actionEvent ->{
            //take user to signup page
            txtPassWord.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Register.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });



        btnLogin.setOnAction(actionEvent -> {

            String userName = txtName.getText().trim();
            String userPwd = txtPassWord.getText().trim();

            User user = new User();

            user.setUsername(userName);
            user.setPassword(userPwd);

            ResultSet result =  dbHandler.LoginUser(user);

            int Counter = 0;

            try {
                while (result.next()){
                    Counter++;
                }

                if(Counter == 1){
                    System.out.println("Login Successful");
                }

            }catch (SQLException e){
                e.printStackTrace();
            }


        });


    }


}