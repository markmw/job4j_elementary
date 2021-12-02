package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean whichMax = first > second;
        return whichMax ? first : second;
    }

    public static void main(String[] args) {
        int number = max(1, 3);
        System.out.println(number);
    }
}
