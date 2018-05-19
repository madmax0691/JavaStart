/*package Lesson7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] arrayIn) {
        int halfSize = arrayIn.length / 2;
        for (int i = halfSize; i < arrayIn.length - 1; i++) {
            int temp = arrayIn[halfSize - i];
            arrayIn[halfSize - i] = arrayIn[halfSize + i];
            arrayIn[halfSize + i] = temp;
        }
    }
}*/
