package Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter:");
        int cakes = scanner.nextInt();
        System.out.println("I have " + cakes + " cakes.");

        for (int i = 1; i <= cakes; i++) {
            System.out.println("I have eaten " + i + " cake.");
            if (i % 2 == 0) {
                System.out.println("Wonderful world");
            }


        }
    }
}
