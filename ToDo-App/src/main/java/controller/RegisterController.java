package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import database.dbHandler;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController {

    //private dbHandler dbHandler;

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

        dbHandler databasehandler = new dbHandler();
        btnSignUp.setOnAction(actionEvent -> {
         databasehandler.signUp(txtName.getText(), txtlastName.getText(), txtUserName.getText(), txtPassWord.getText(), "Female" );

       });

    }
}
