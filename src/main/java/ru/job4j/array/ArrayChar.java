package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        return word[0] == pref[0] && word[1] == pref[1];
    }
}
