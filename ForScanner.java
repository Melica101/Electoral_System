package electoralsystem;

import java.util.Scanner;

public abstract class ForScanner {

    String Name;

    static Scanner election = new Scanner(System.in);

    public void add() {
        System.out.println("What's the name of the candidate?");
        Name = election.next();

    }
}
