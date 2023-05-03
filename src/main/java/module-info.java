module com.td_ihm.td1_ihm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.td_ihm.td1_ihm to javafx.fxml;
    exports com.td_ihm.td1_ihm;
}