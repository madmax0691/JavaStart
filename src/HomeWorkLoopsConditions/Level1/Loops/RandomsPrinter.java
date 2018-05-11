package HomeWorkLoopsConditions.Level1.Loops;

import java.util.Random;

//        Напечатать в консоль count псевдослучайных чисел в диапазоне от min до max включительно.
//        Можно использовать класс java.util.Random
public class RandomsPrinter {
    public static void main(String[] args) {
        printRandoms(3, 10, 20);
        printRandoms(-3, 10, 20);
        printRandoms(3, 30, 20);
    }

    public static void printRandoms(int count, int min, int max) {

        if (count <= 0 || min > max) {
            throw new IllegalArgumentException("count > 0, min <= max");
        }

        int counter = 0;

        while (counter < 3) {
            Random random = new Random();
            int number = random.nextInt(max - min) + min;
            System.out.println(number);
            counter++;
        }
    }

}
//Test
/*
        14
        17
        16
        Exception in thread "main" java.lang.IllegalArgumentException: count > 0, min <= max
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.RandomsPrinter.printRandoms(RandomsPrinter.java:17)
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.RandomsPrinter.main(RandomsPrinter.java:10)

        Process finished with exit code 1*/
/*
        13
        16
        16
        Exception in thread "main" java.lang.IllegalArgumentException: count > 0, min <= max
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.RandomsPrinter.printRandoms(RandomsPrinter.java:17)
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.RandomsPrinter.main(RandomsPrinter.java:10)

        Process finished with exit code 1*/
