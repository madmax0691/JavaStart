package HomeWorkArraysMethods.Level1;

//Выполнить чтение массива с консоли.
//Формат входных значений:
//      <размер массива>
//      <элементы массива, разделенный пробелом>
//Считать, что пользователь всегда вводит корректные числа.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(Arrays.toString(readArray(sc)));
    }

    public static int[] readArray(Scanner scanner) {
        System.out.println("Enter size");
        int array[] = new int[scanner.nextInt()];

        Scanner num = new Scanner(System.in);

        System.out.println("Enter numbers");
        for (int index = 0; index < array.length; index++) {
            array[index] = Integer.parseInt(num.next());
        }
        return array;
    }
}
/*

Enter size
3
Enter numbers
10 30 20
[10, 30, 20]
Process finished with exit code 0
*/
