package dev.natasha.voting.controllers;

import dev.natasha.voting.objects.Election;
import dev.natasha.voting.objects.Voter;
import dev.natasha.voting.navigator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Random;

public class VotingAppController {
    private Election election = Election.getElection();

    @FXML
    private Label labelText;

    @FXML
    protected void onHomeButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("welcome-view.fxml"));
        stage.setTitle("Voting App");
    }

    @FXML
    protected void onVoterButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voter-view.fxml"));
        stage.setTitle("Voter View");
    }

    @FXML
    protected void onRegisterVoter() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voter-register.fxml"));
        stage.setTitle("Voter Register");
    }

    @FXML
    private TextField fNameField;

    @FXML
    private TextField lNameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextArea addressField;

    @FXML
    private Label voterRegisterText;

    @FXML
    protected void onVoterRegisterSubmitButton() throws NumberFormatException {
        try {
            String fName = fNameField.getText();
            String lName = lNameField.getText();
            String address = addressField.getText();
            int age = Integer.parseInt(ageField.getText());


            Random r = new Random();
            int randomInt = r.nextInt(100) + 1;

            int id = randomInt;
            boolean verified = true;

            Voter voter = new Voter(id, verified, fName, lName, age, address);

            voterRegisterText.setText("Thank you." + System.lineSeparator() + "You just registered to vote." + System.lineSeparator() + "Voter ID: " + voter.getVoterID());

        } catch (NumberFormatException e) {
            voterRegisterText.setText("please enter a number for your age");
        }

    }

    @FXML
    protected void onVoteInElection() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voting-view.fxml"));
        stage.setTitle("Voting View");
    }

    @FXML
    private Label candidateSelectionText;

    @FXML
    protected void onCandidateOneButtonClick() {
        election.voteForCandidateOne();
        candidateSelectionText.setText("You voted for Candidate One!");
    }

    @FXML
    protected void onCandidateTwoButtonClick() {
        election.voteForCandidateTwo();
        candidateSelectionText.setText("You voted for Candidate Two!");
    }

    @FXML
    protected void onAuditorButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("results-view.fxml"));
        stage.setTitle("Auditor View");
    }

    @FXML
    protected void onAdministratorButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("results-view.fxml"));
        stage.setTitle("Administrator View");
    }

    @FXML
    private Label resultsText;

    @FXML
    protected void onResultsButtonClick() {
        resultsText.setText(election.getElectionResult());
    }
}
