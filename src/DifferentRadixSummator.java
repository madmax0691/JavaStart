import java.util.Scanner;

/*С клавиатуры вводятся данные:
        Число X в 2-ой системе счисления.
        Число Y в 8-ой системе счисления.
        Число Z в 16-ой системе счисления.
        Нужно вывести сумму (X + Y + Z). Все введенные данные являются корректными.
        Использовать методы из класса Scanner.

        Пример ввода:
        Enter X in Bin: 1011
        Enter Y in Oct: 73
        Enter Z in Hex: ABC

        Вывод:
        X + Y + Z = 2818*/


public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X in Bin:");
        String bin = scanner.next();

        System.out.println("Enter Y in Oct:");
        String oct = scanner.next();

        System.out.println("Enter Z in Hex");
        String hex = scanner.next();

        int sum = Integer.parseInt(bin, 2) + Integer.parseInt(oct, 8) + Integer.parseInt(hex, 16);

        System.out.println("X + Y + Z = " + sum);
    }
}

/*    Enter X in Bin:
        1011
        Enter Y in Oct:
        73
        Enter Z in Hex
        abc
        X + Y + Z = 2818*/
