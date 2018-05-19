package Lesson7;

import java.util.Arrays;

public class Zebra {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createZebra(4)));
        System.out.println(Arrays.toString(createZebra(5)));
    }

    public static String[] createZebra(int size) {
        String array[] = new String[size];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = "white";
            } else {
                array[i] = "black";
            }

        }
        return array;
    }
}
