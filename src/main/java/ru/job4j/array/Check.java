package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (result != data[index]) {
                result = false;
            } else if (result == data[index]) {
                result = true;
            }
        }
        return result;
    }
}
