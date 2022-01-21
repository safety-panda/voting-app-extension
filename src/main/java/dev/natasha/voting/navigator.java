package dev.natasha.voting;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class navigator {

    public static Scene getScene(String name) throws IOException {
        var fxmlLoader = new FXMLLoader(VotingApp.class.getResource(name));
        return new Scene(fxmlLoader.load());
    }

}
