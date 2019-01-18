package electoralsystem;

public class Candidate extends ForScanner {

    String name;
    int count = 0;

    private static Candidate cand = null;

    public static Candidate getInstance() {
        if (cand == null) {
            cand = new Candidate();
        }
        return cand;
    }

    public void setName() {
        System.out.println("What's your name?");
        name = election.next();
    }

    public void campaign() {
        System.out.println("Vote for " + name + "!!!");
    }

    public void view() {
        Coordinate.getPlace();
        Coordinate.getTime();
    }
}
