package Lesson5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
