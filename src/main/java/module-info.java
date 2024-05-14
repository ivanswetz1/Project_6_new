module org.example.project_6_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.project_6_new to javafx.fxml;
    exports org.example.project_6_new;
}