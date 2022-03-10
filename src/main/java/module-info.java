module dev.natasha.voting {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens dev.natasha.voting to javafx.fxml;
    exports dev.natasha.voting;
    exports dev.natasha.voting.objects;
    opens dev.natasha.voting.objects to javafx.fxml;
    exports dev.natasha.voting.controllers;
    opens dev.natasha.voting.controllers to javafx.fxml;
}