package dev.natasha.voting.objects;

public class Election {
    private static Election instance;

    protected int candidateOne = 0;
    protected int candidateTwo = 0;

    public String getElectionResult() {
        return "Candidate One: " + candidateOne + " votes." + System.lineSeparator() + "Candidate Two: " + candidateTwo + " votes.";
    }

    public void voteForCandidateOne() {
        candidateOne++;
    }

    public void voteForCandidateTwo() {
        candidateTwo++;
    }

    public static Election getElection() {
        if (instance == null) {
            instance = new Election();
        }
        return Election.instance;
    }
}
