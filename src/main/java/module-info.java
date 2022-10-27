module com.example.harmonik_seri {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.harmonik_seri to javafx.fxml;
    exports com.example.harmonik_seri;
}