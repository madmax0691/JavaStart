package HomeWorkArraysMethods.Level0;

//Задан массив int[] array. Вывести в консоль все положительные элементы в обратном порядке

public class Array9 {
    public static void main(String[] args) {
        int array[] = {3, 10, 15, 20, -2, 13, -40};
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
/*
13 20 15 10 3
Process finished with exit code 0
*/
