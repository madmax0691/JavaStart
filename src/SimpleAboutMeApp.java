import java.util.Scanner;

/*
Task 1 (SimpleAboutMeApp)
        С клавиатуры вводятся данные:
        Имя.
        Фамилия.
        Возраст.
        Нужно вывести эту информацию в приветственной форме от первого лица. Все введенные данные являются корректными.

        Пример ввода:
        Enter your name: John
        Enter your surname: Smith
        Enter your age: 30

        Вывод:
        I’m John Smith, 30 years old
*/

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your surname:");
        String surName = scanner.next();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println("I am " + name + " " + surName + "," + age + " years old");
    }
}

/*
    Enter your name:
        Max
        Enter your surname:
        Kazmyryk
        Enter your age:
        26
        I am Max Kazmyryk,26 years old

        Process finished with exit code 0*/

/*
    Enter your name:
        Dart
        Enter your surname:
        Veider
        Enter your age:
        600
        I am Dart Veider,600 years old

        Process finished with exit code 0*/
