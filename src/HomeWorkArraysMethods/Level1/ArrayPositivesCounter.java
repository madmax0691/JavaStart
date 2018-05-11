package HomeWorkArraysMethods.Level1;

//Посчитать количество положительных чисел в массиве.
//Использовать цикл for-each

public class ArrayPositivesCounter {
    public static void main(String[] args) {
        int demoArray[] = {-3, 0, -1, 4, -2, 5};
        int demoArrayTwo[] = {-3, 0, -1, -4, -2, -5};
        int demoArrayThird[] = {};
        System.out.println(countPositives(demoArray));
        System.out.println(countPositives(demoArrayTwo));
        System.out.print(countPositives(demoArrayThird));
    }

    public static int countPositives(int[] array) {
        int counter = 0;
        for (int number :
                array) {
            if (number > 0) {
                counter++;
            }
        }
        return counter;
    }
}
/*
2
0
0
Process finished with exit code 0
*/
