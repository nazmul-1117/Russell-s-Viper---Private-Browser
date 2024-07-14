module com.russellsviper.russellsviperprivatebrowser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.russellsviper.russellsviperprivatebrowser to javafx.fxml;
    exports com.russellsviper.russellsviperprivatebrowser;
    exports com.russellsviper.controller;
    opens com.russellsviper.controller to javafx.fxml;
}