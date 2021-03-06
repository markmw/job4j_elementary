package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(18, 3, 13, 3);
        System.out.println("result (2, 3) to (2, 4) " + result);
        result = Point.distance(1, 5, 4, 2);
        System.out.println("result (1, 5) to (4, 2) " + String.format("%.2f", result));
    }
}