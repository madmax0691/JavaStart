package HomeWorkArraysMethods.Level0;

//Задан массив int[] array. Вывести в консоль индексы всех положительных элементов

public class Array7 {
    public static void main(String[] args) {
        int array[] = {3, 10, 15, 20, -2, 13, -40};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
0 1 2 3 5
Process finished with exit code 0
*/
