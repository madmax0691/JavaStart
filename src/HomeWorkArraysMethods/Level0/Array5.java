package HomeWorkArraysMethods.Level0;

//Задан массив int[] array. Заполнить массив числом 42, используя класс Arrays

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int array[] = new int[5];
        Arrays.fill(array, 42);
        System.out.println(Arrays.toString(array));
    }
}
/*

[42, 42, 42, 42, 42]

Process finished with exit code 0
*/
