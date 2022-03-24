package dev.natasha.voting.objects;

public class Election {
    private static Election instance;

    public String candidateOneName = "Candidate One";
    public String candidateTwoName = "Candidate Two";

    protected int candidateOneVotes = 0;
    protected int candidateTwoVotes = 0;

    public static Election getElection() {
        if (instance == null) {
            instance = new Election();
        }
        return Election.instance;
    }

    public void setCandidateOneName(String c1Name) {
        candidateOneName = c1Name;
    }
    public void setCandidateTwoName(String c2Name) {
        candidateTwoName = c2Name;
    }

    public void voteForCandidateOne() {
        candidateOneVotes++;
    }
    public void voteForCandidateTwo() {
        candidateTwoVotes++;
    }

    public String getElectionResult() {
        return candidateOneName + ": " + candidateOneVotes + " votes." + System.lineSeparator() + candidateTwoName + ": " + candidateTwoVotes + " votes.";
    }
}
