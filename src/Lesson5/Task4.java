package Lesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int cakes = scanner.nextInt();
        System.out.println("Enter borderCake :");
        int borderCake = scanner.nextInt();
        System.out.println("I have " + cakes + " cakes.");

        for (int i = 1; i <= cakes; i++) {
            System.out.println("I have eaten " + i + " cake.");
            if (i > borderCake) {
                System.out.println("I am feeling bad");
            }
        }
    }
}
