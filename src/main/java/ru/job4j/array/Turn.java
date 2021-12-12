package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == array[0]) {
                int temp = array[index];
                array[index] = array[array.length - 1];
                array[array.length - 1] = temp;
            } else if (array[index] == 1) {
                int temp = array[1];
                array[1] = array[array.length - 2];
                array[array.length - 2] = temp;
                break;
            }
        }
        return array;
    }
}
