package dev.natasha.voting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VotingApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var fxmlLoader = new FXMLLoader(VotingApp.class.getResource("welcome-view.fxml"));
        var scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Voting App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
