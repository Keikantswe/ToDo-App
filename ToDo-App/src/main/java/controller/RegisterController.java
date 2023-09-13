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

       //DatabaseHandler databaseHandler = new DatabaseHandler();
        btnSignUp.setOnAction(actionEvent -> {

       });

    }
}
