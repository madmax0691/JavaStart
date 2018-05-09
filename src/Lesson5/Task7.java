package Lesson5;
/*
Дано 2 длинных положительных целых числа, представленных в виде строк. (Длина чисел до 1000 цифр.) - не учитывал.
Посчитать сумму этих двух чисел.
Использовать классы BigInteger и BigDecimal запрещается.

IN: "100", "356"
OUT: "456"*/

public class Task7 {
    public static void main(String[] args) {
        String stringOne = "100";
        String stringTwo = "356";

        int numbersOne[] = new int[stringOne.length()];
        int numbersTwo[] = new int[stringTwo.length()];
        //переводим стринг в числа и заливаем их в массивы
        for (int i = 0; i < stringOne.length(); i++) {
            numbersOne[i] = Character.digit(stringOne.charAt(i), 10);
        }
        for (int i = 0; i < stringTwo.length(); i++) {
            numbersTwo[i] = Character.digit(stringTwo.charAt(i), 10);
        }
        //суммируем числа с учетом порядка для первого массива
        long sumOne = 0;
        for (int i = 0, j = (numbersOne.length) - 1; i < numbersOne.length; i++, j--) {
            int dec = (int) Math.pow(10, j);
            sumOne += numbersOne[i] * dec;
        }
        //суммируем числа с учетом порядка для второго массива
        long sumTwo = 0;
        for (int i = 0, j = (numbersTwo.length) - 1; i < numbersTwo.length; i++, j--) {
            int dec = (int) Math.pow(10, j);
            sumTwo += numbersTwo[i] * dec;
        }
        //суммируем числа
        long sumAll = sumOne + sumTwo;

        //выводим сумму и переводим ее обратно в String
        System.out.print(Long.toString(sumAll));
    }
}
