package Lesson5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cakes:");
        int cakes = scanner.nextInt();
        System.out.println("Enter peoples:");
        int persons = scanner.nextInt();

        for (int i = 1; i <= persons; i++) {
            System.out.println("I am " + i + " person." + "I have " + cakes + ".");
            for (int j = 1; j <= cakes; j++) {
                System.out.println("I have eaten " + j + " cake.");
            }
            System.out.println();
        }
    }
}

