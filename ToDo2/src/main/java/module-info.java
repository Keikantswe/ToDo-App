module com.example.todo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todo2 to javafx.fxml;
    exports com.example.todo2;
    exports controller;
    opens controller to javafx.fxml;
}