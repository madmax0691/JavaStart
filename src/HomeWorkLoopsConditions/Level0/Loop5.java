package HomeWorkLoopsConditions.Level0;

import java.util.Scanner;

//Прочитать с клавиатуры числа int from, to, причем from <= to. Вывести в консоль from, from+1, from+2, … to
public class Loop5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter from:");
        int from = scanner.nextInt();
        System.out.print("Enter to:");
        int to = scanner.nextInt();

        scanner.close();

        if (from > to) {
            System.out.println("Invalid numbers");
        } else {
            for (int i = from; i <= to; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
//Tests
/*
        Enter from:10
        Enter to:5
        Invalid numbers
        Process finished with exit code 0
*/
/*
        Enter from:20
        Enter to:30
        20 21 22 23 24 25 26 27 28 29 30
        Process finished with exit code 0
*/
