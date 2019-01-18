package electoralsystem;

public class Coordinate extends ForScanner {

    private static String Place;
    private static String Time;

    private static Coordinate coor = null;

    public static Coordinate getInstance() {
        if (coor == null) {
            coor = new Coordinate();
        }
        return coor;
    }

    public static void setPlace() {
        System.out.println("Where will the election be held?");
        Place = election.next();
    }

    public static void setTime() {
        System.out.println("When will the election be held?");
        Time = election.next();
    }

    public static String getPlace() {
        return Place;
    }

    public static String getTime() {
        return Time;
    }
}
