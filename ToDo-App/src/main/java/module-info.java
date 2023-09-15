module com.example.todoapp {
    requires javafx.graphics;
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.controls;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.todoapp to javafx.fxml;
    exports com.example.todoapp;
    exports controller;
    opens controller to javafx.fxml;
}