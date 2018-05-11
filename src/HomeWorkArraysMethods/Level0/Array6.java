package HomeWorkArraysMethods.Level0;

//Задан массив int[] array. Отсортировать массив, используя класс Arrays

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int array[] = {3, 10, 15, 20, -2, 13};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
/*
[-2, 3, 10, 13, 15, 20]

Process finished with exit code 0
*/
