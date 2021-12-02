package ru.job4j.condition;

public class Cinema {
    public static void acess(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age > 16) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        acess(21);
        acess(16);
    }
}
