module dev.natasha.voting {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.natasha.voting to javafx.fxml;
    exports dev.natasha.voting;
}