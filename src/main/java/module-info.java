module de.gfi.calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.gfi.calc to javafx.fxml;
    exports de.gfi.calc;
}