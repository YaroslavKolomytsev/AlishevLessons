module com.example.alishevless {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alishevless to javafx.fxml;
    exports com.example.alishevless;
}