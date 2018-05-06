package Lesson3;

import java.util.Scanner;

/*      Task 3
        С клавиатуры вводится строка name.
        Написать программу подстановки в сообщение Hi, my name is ${name} имени name, вместо шаблона ${name}. Использовать метод из класса String.

        Пример ввода:
        Enter name: John

        Вывод:
        Hi, my name is John*/

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.next();
        String out = "Hi, my name is ${name}";

        scanner.close();

        System.out.println(out.replaceAll("\\$\\{name\\}", name));

    }
}

/*
    Enter name:
        Vova
        Hi, my name is Vova*/

/*
    Enter name:
        Max
        Hi, my name is Max

        Process finished with exit code 0*/
