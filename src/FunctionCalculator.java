import java.util.Scanner;

/*Task 4 (FunctionCalculator)
        С клавиатуры вводится число типа double: x.
        Найти результат функции:

        Использовать методы класса Math.

        Пример ввода:
        Enter x: 0,5

        Вывод:
        f(x) = -0.16190946372347814*/


public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        double number = scanner.nextDouble();

        scanner.close();

        System.out.println("f(x) = " + Math.log(Math.sin(number)+Math.exp(number)*(Math.sqrt(number)/Math.PI)));
    }
}

/*
    Enter x:
        0.5
        f(x) = -0.16190946372347814

        Process finished with exit code 0*/
