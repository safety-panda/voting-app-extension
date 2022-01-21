package dev.natasha.voting.objects;

public class Auditor extends User {
    public int auditorID;
    private String firstName;
    private String lastName;


    public Auditor(int id, String fName, String lName) {
        auditorID = id;
        firstName = fName;
        lastName = lName;

        // update parent class with role
        super.role = "AUDITOR";
    }

    public Auditor() {
        auditorID = 0;
        firstName = "DEFAULT";
        lastName = "AUDITOR";

        // update parent class with role
        super.role = "AUDITOR";
    }

    public int getAuditorID() {
        return auditorID;
    }
}
