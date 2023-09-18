package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import database.dbHandler;
import javafx.fxml.FXML;
import model.User;

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


        btnSignUp.setOnAction(actionEvent -> {
         createUser();

       });
    }

    private void createUser() {
        dbHandler databasehandler = new dbHandler();

        String firstname = txtName.getText();
        String lastname = txtlastName.getText();
        String username = txtUserName.getText();
        String password = txtPassWord.getText();
        String gender;

        if (rdbFemale.isSelected()) {
            gender = "Female";
        } else {
            gender = "Male";
        }

        User user = new User(firstname,lastname, username, password, gender);

        databasehandler.signUp(user);
    }
}
