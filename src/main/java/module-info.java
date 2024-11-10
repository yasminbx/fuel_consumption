module org.example.fuel_consumption {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.fuel_consumption to javafx.fxml;
    exports org.example.fuel_consumption;
}