package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtName1;

    @FXML
    private JFXTextField txtName2;

    @FXML
    private JFXPasswordField txtPassWord;

    @FXML
    void initialize() {
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtName1 != null : "fx:id=\"txtName1\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtName2 != null : "fx:id=\"txtName2\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtPassWord != null : "fx:id=\"txtPassWord\" was not injected: check your FXML file 'Register.fxml'.";

    }
}
