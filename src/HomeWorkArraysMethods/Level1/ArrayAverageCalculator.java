package HomeWorkArraysMethods.Level1;

//Посчитать среднее арифметическое всех элементов массива.
//Использовать цикл for-each

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        int demoArrayOne[] = {5, 10, 2};
        int demoArrayTwo[] = {};

        System.out.println(average(demoArrayOne));
        System.out.print(average(demoArrayTwo));
    }

    public static int average(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        int index = 0;
        for (int number :
                array) {
            sum += number;
            index++;
        }
        return sum / index;
    }
}
/*
5
Exception in thread "main" java.lang.IllegalArgumentException
	at HomeWorkArraysMethods.Level1.ArrayAverageCalculator.average(ArrayAverageCalculator.java:17)
	at HomeWorkArraysMethods.Level1.ArrayAverageCalculator.main(ArrayAverageCalculator.java:12)

Process finished with exit code 1
*/
