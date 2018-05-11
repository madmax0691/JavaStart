package HomeWorkArraysMethods.Level0;

//Задан массив int[] array. Вывести в консоль все положительные элементы, используя цикл for-each

public class Array8 {
    public static void main(String[] args) {
        int array[] = {3, 10, 15, 20, -2, 13, -40};
        for (int index : array) {
            if (index > 0) {
                System.out.print(index + " ");
            }
        }
    }
}
/*
3 10 15 20 13
Process finished with exit code 0
*/
