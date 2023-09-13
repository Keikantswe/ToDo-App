package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
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
    private JFXTextField txtlastName;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    private JFXCheckBox rdbMale;

    @FXML
    private JFXCheckBox rdbFemale;

    @FXML
    private JFXPasswordField txtPassWord;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    void initialize() {
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtlastName != null : "fx:id=\"txtlastName\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtUserName != null : "fx:id=\"txtUserName\" was not injected: check your FXML file 'Register.fxml'.";
        assert rdbMale != null : "fx:id=\"rdbMale\" was not injected: check your FXML file 'Register.fxml'.";
        assert rdbFemale != null : "fx:id=\"rdbFemale\" was not injected: check your FXML file 'Register.fxml'.";
        assert txtPassWord != null : "fx:id=\"txtPassWord\" was not injected: check your FXML file 'Register.fxml'.";
        assert btnSignUp != null : "fx:id=\"btnSignUp\" was not injected: check your FXML file 'Register.fxml'.";

    }
}
