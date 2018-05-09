package HomeWorkLoopsConditions.Level2;

import java.util.Random;
import java.util.Scanner;

/*
Создать программу, в которой генерируется случайное целое число от 1 до 100.
Пользователь должен его отгадать не более, чем за 5 попыток.
После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
Если за 5 попыток число не отгадано, то вывести загаданное число.
Считать, что пользователь всегда вводит корректные числа.
Для генерации псевдослучайных чисел можно использовать класс java.lang.Random
*/
public class RandomGameApp {
    public static void main(String[] args) {

        System.out.println("Let`s play!");
        Random random = new Random();
        int min = 1;
        int max = 100;
        int number = random.nextInt(max - min) + min;
        int counter = 0;
        int compareMin = 0;
        int compareMax = 100;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Input number (" + compareMin + ".." + compareMax + "): ");

            int scan = scanner.nextInt();

            if (scan == number) {
                System.out.println("YOU WIN!!! Random number was " + number);
                break;
            } else {
                if (scan < number) {
                    compareMin = scan + 1;
                } else {
                    compareMax = scan - 1;
                }
                counter++;
            }
        } while (counter < 5);
        if (counter >= 5) {
            System.out.println("Sorry, you lose. Random number was " + number);
        }
    }
}
//Tests
/*

Let`s play!
Input number (0..100): 40
Input number (41..100): 70
Input number (71..100): 80
Input number (81..100): 99
Input number (81..98): 90
Sorry, you lose. Random number was 84

Process finished with exit code 0*/
/*
Let`s play!
Input number (0..100): 50
Input number (0..49): 20
Input number (0..19): 10
Input number (11..19): 14
Input number (15..19): 17
Sorry, you lose. Random number was 15

Process finished with exit code 0*/
/*
Let`s play!
Input number (0..100): 80
Input number (0..79): 20
Input number (21..79): 70
Input number (21..69): 50
Input number (51..69): 69
Sorry, you lose. Random number was 53

Process finished with exit code 0*/

