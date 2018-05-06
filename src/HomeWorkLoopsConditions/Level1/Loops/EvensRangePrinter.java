package HomeWorkLoopsConditions.Level1.Loops;

//Вывести на экран чётные числа от first до last. Если first > last, ничего не выводить.
public class EvensRangePrinter {
    public static void main(String[] args) {
        printEvensRange(1, 9);
        printEvensRange(9, 1);
    }

    public static void printEvensRange(int first, int last) {
        System.out.println("For numbers: " + first + ", " + last);
        if (first < last) {
            for (int i = first; i <= last; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
//        Test
//        For numbers: 1, 9
//        2 4 6 8
//        For numbers: 9, 1
//
//    Process finished with exit code 0