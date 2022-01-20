package dev.natasha.voting;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VotingAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
