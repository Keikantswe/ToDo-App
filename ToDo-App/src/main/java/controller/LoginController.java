package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
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

    @FXML
    void initialize() {

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

        String userName = txtName.getText().trim();
        String userPwd = txtPassWord.getText().trim();

        btnLogin.setOnAction(actionEvent -> {
            if(!userName.isEmpty() || !userPwd.isEmpty()){
                LoginUser(userName, userPwd);
            }else{
                System.out.println("Login error");
            }
        });


    }

    public void LoginUser(String username, String password){
        //Check if the user exists.


    }
}