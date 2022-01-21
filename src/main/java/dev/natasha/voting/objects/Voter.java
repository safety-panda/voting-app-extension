package dev.natasha.voting.objects;

public class Voter extends User {
    public int voterID;
    public boolean verified;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Voter(int id, boolean verification, String fName, String lName, int inputAge, String inputAddress) {
        voterID = id;
        verified = verification;
        firstName = fName;
        lastName = lName;
        age = inputAge;
        address = inputAddress;

        // update parent class with role
        super.role = "VOTER";
    }

    public Voter() {
        voterID = 0;
        verified = true;
        firstName = "DEFAULT";
        lastName = "VOTER";
        age = 18;
        address = "DEFAULT ADDRESS";

        // update parent class with role
        super.role = "VOTER";
    }

    public int getVoterID() {
        return voterID;
    }
}