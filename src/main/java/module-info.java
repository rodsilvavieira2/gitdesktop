module com.gitdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gitdesktop to javafx.fxml;
    opens com.gitdesktop.screens.start to javafx.fxml;

    requires transitive javafx.graphics;

    exports com.gitdesktop;
}
