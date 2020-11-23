package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 0) to (2, 0) " + Point.distance(0, 0, 2, 0));
        System.out.println("result (0, 1) to (2, 0) " + Point.distance(1, 1, 2, 0));
        System.out.println("result (0, 0) to (2, 1) " + Point.distance(0, 0, 2, 1));
        System.out.println("result (1, 1) to (2, 15) " + Point.distance(1, 1, 2, 15));
        System.out.println("result (150, 0) to (2, 0) " + Point.distance(150, 0, 2, 0));
    }
}
