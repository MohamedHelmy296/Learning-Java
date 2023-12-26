module com.example.librarysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.workspacesystem to javafx.fxml;
    exports com.example.workspacesystem;
}