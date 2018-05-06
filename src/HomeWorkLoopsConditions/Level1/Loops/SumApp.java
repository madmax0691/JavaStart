package HomeWorkLoopsConditions.Level1.Loops;

import java.util.Scanner;

//        Посчитать сумму целых чисел, которые пользователь вводит с консоли.
//        Считывать числа, пока не будет введено 0.
//        Считать, что пользователь вводит только корректные числа типа int.
public class SumApp {
    public static void main(String[] args) {
        System.out.println(clientElemsSum());
    }

    public static int clientElemsSum() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Enter numbers: ");
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        scanner.close();

        return sum;
    }
}
//        Test
//        Enter numbers:
//        10
//        20
//        30
//        0
//        60
//
//        Process finished with exit code 0
//
//        Enter numbers:
//        0
//        0
//
//        Process finished with exit code 0
