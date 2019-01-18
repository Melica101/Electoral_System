package electoralsystem;

import static electoralsystem.ElectoralSystem.choice;

public class Voter extends ForScanner {

    private static Voter voter = null;

    public static Voter getInstance() {
        if (voter == null) {
            voter = new Voter();
        }
        return voter;
    }

    public void vote() {
        for (int i = 0; i < Neutral.candidates.size(); i++) {
            System.out.println(Neutral.candidates.indexOf(Neutral.candidates.get(i)) + " " + Neutral.candidates.get(i));

        }
        if (Neutral.count.isEmpty()) {
            for (int i = 0; i < Neutral.candidates.size(); i++) {
                Neutral.count.add(i, 0);
            }
        }

        Neutral neut = new Neutral();
        int c = choice.nextInt();
        System.out.println("You have chosen " + Neutral.candidates.get(c));
        Neutral.count.set(c, Neutral.count.get(c) + 1);

    }

    public void view() {
        Coordinate.getPlace();
        Coordinate.getTime();
    }

}
