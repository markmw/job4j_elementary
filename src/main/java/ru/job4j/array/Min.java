package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array[array.length - 1]; index++) {
            if (min > index) {
                min = array[index];
            }
        }
        return min;
    }
}
