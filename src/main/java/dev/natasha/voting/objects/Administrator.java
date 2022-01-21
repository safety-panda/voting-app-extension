package dev.natasha.voting.objects;

public class Administrator extends User {
    public int adminID;
    private String firstName;
    private String lastName;


    public Administrator(int id, String fName, String lName) {
        adminID = id;
        firstName = fName;
        lastName = lName;

        // update parent class with role
        super.role = "ADMINISTRATOR";
    }

    public Administrator() {
        adminID = 0;
        firstName = "DEFAULT";
        lastName = "ADMIN";

        // update parent class with role
        super.role = "ADMINISTRATOR";
    }

    public int getAdminID() {
        return adminID;
    }
}
