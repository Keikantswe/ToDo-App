package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


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
        assert btnSignUp != null : "fx:id=\"btnSignUp\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtPassWord != null : "fx:id=\"txtPassWord\" was not injected: check your FXML file 'Login.fxml'.";

    }
}