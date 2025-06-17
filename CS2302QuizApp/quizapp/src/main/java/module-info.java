module com.knvb.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.knvb.quizapp to javafx.fxml;
    exports com.knvb.quizapp;
}
