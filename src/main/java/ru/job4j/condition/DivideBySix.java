package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl = "";
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else if (number % 3 != 0 && number % 2 != 0) {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(7));
        System.out.println(checkNumber(6));
        System.out.println(checkNumber(8));
        System.out.println(checkNumber(9));
    }
}