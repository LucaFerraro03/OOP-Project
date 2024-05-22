module com.example.provacanvas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Fractals to javafx.fxml;
    exports com.example.Fractals;
}