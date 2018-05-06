package HomeWorkLoopsConditions.Level1.Loops;

//Вывести на экран целые числа от first до last.
public class RangePrinter {
    public static void main(String[] args) {
        printRange(1, 5);
        printRange(5, 1);
        printRange(1, 1);
    }

    public static void printRange(int first, int last) {
        System.out.println("For numbers: " + first + ", " + last);
        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
        } else {
            if (first == last) {
                System.out.println(first);
            } else {
                for (int i = first; i >= last; i--) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}
//        Test
//        For numbers: 1, 5
//        1 2 3 4 5
//        For numbers: 5, 1
//        5 4 3 2 1
//        For numbers: 1, 1
//        1