package electoralsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Neutral {

    private static Neutral neut = null;

    public static Neutral getInstance() {
        if (neut == null) {
            neut = new Neutral();
        }
        return neut;
    }
    public static ArrayList<String> candidates = new ArrayList<>();
    public static ArrayList<Integer> count = new ArrayList<>();

    static Scanner candidate = new Scanner(System.in);

    public void register() {
        System.out.println("Add name of a legal candidate");
        String name = candidate.next();
        candidates.add(name);
    }

    public void announce() {
        int max = 0;
        for (int a = 1; a < count.size(); a++) {
            for (int b = (count.size()) - 1; b >= a; b--) {
                if (count.get(b - 1) > count.get(b)) {
                    max = count.get(b - 1);
                }
            }
        }
        System.out.println("<<< The winner of this election is " + candidates.get(count.indexOf(max)) + "!! >>>");
    }

    public void view() {
        Coordinate.getPlace();
        Coordinate.getTime();
    }
}
