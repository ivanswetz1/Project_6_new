module org.example.project_6_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.project_6_new to javafx.fxml;
    exports org.example.project_6_new;
    exports org.example.project_6_new.Part_1;
    opens org.example.project_6_new.Part_1 to javafx.fxml;
}