package HomeWorkArraysMethods.Level1;

//Найти последний положительный элемент в массиве.
// Если положительных элементов нет, вернуть минимальное значение int (Integer.MIN_VALUE)

public class ArrayLastPositiveFinder {
    public static void main(String[] args) {
        int demoArrayOne[] = {-3, -1, 20, -2, 10, 0};
        int demoArrayTwo[] = {-3, -1, -20, -2, -10, 0};

        System.out.println(lastPositiveElem(demoArrayOne));
        System.out.print(lastPositiveElem(demoArrayTwo));
    }

    public static int lastPositiveElem(int[] array) {
        int value = 0;
        for (int number :
                array) {
            if (number > 0) {
                value = number;
            }
        }
        if (value == 0) {
            return Integer.MIN_VALUE;
        }
        return value;
    }
}
/*
10
-2147483648
Process finished with exit code 0
*/
