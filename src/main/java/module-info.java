module com.example.poli2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.poli2 to javafx.fxml;
    exports com.example.poli2;
}