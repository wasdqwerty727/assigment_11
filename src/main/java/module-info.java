module com.example.demo23 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demo23 to javafx.fxml;
    exports com.example.demo23;
}