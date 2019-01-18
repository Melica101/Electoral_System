package electoralsystem;

import java.util.Scanner;

public class ElectoralSystem {

    static Scanner choice = new Scanner(System.in);

    public static void system() {
        Neutral neut = Neutral.getInstance();
        Coordinate coor = Coordinate.getInstance();
        Candidate cand = Candidate.getInstance();
        Voter voter = Voter.getInstance();

        System.out.println("WELCOME TO THE ELECTORAL SYSTEM");
        System.out.println("<<<What role do you play in this system?>>>");
        System.out.println("Press 1 for Neutral committee");
        System.out.println("Press 2 for Coordinate committee");
        System.out.println("Press 3 for Candidate");
        System.out.println("Press 4 for Voter");
        int a = choice.nextInt();

        if (a == 1) {
            System.out.println("WELCOME, MEMBER OF NEUTRAL COMMITTEE");
            System.out.println("<<<What service would you like?>>>");
            System.out.println("Press 1 for registering a candidate");
            System.out.println("Press 2 for announcing the winner");
            System.out.println("Press 3 to see the place and time of election");
            int b = choice.nextInt();

            if (b == 1) {
                neut.register();
            } else if (b == 2) {
                neut.announce();
            } else if (b == 3) {
                neut.view();
            }
        } else if (a == 2) {
            System.out.println("WELCOME, MEMBER OF COORDINATE COMMITTEE");
            System.out.println("You can set the time and place of the election");
            System.out.println("Press 1 to set the place");
            System.out.println("Press 2 to set the time");
            int b = choice.nextInt();

            if (b == 1) {
                coor.setPlace();
            } else if (b == 2) {
                coor.setTime();
            }
        } else if (a == 3) {
            System.out.println("WELCOME, CANDIDATE");
            cand.setName();
            if (neut.candidates.contains(cand.name)) {
                System.out.println("Press 1 to post a voting campaign");
                System.out.println("Press 2 to see the place and time of election");
                int b = choice.nextInt();
                if (b == 1) {
                    cand.campaign();
                } else if (b == 2) {
                    cand.view();
                }
            } else {
                System.out.println("You are not an elligible candidate");
            }
        } else if (a == 4) {
            System.out.println("WELCOME, VOTER");
            System.out.println("Press 1 for voting");
            System.out.println("Press 2 to see the place and time of election");
            int c = choice.nextInt();
            if (c == 1) {
                System.out.println("Who do you wanna vote for? \n (Choose the number before the name of the candidate)");
                voter.vote();
            } else if (c == 2) {
                voter.view();
            }
        }
    }

    public static void main(String[] args) {
        int start = 0;

        while (start == 0) {
            system();
            System.out.println("\n Press 0 to go back to first menu");
            System.out.println(" Press 1 to exit");
            start = choice.nextInt();
        }
    }
}
