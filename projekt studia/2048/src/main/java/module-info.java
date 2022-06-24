module projekt.studia {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens studia.aplikacja to javafx.fxml;
    opens studia.aplikacja.ui to javafx.fxml;
    exports studia.aplikacja;
}