module com.example.assignment_4_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.assignment_4_game to javafx.fxml;
    exports com.example.assignment_4_game;
}