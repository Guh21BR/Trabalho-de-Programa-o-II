module com.trabalhodeprog {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.trabalhodeprog to javafx.fxml;
    exports com.trabalhodeprog;
}
