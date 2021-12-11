package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] names = new int[5];
        for (int index = 0; index < names.length; index++) {
            names[index] = index * 2 + 3;
        }
        for (int index : names) {
            System.out.println(index);
        }
    }
}
