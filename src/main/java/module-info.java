module org.example.searchmodule {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.searchmodule to javafx.fxml;
    exports org.example.searchmodule;
    exports essential;
    opens essential to javafx.fxml;
}