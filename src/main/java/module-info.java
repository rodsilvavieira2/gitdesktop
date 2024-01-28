module com.gitdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gitdesktop to javafx.fxml;
    opens com.gitdesktop.screens.start to javafx.fxml;

    exports com.gitdesktop;
}
