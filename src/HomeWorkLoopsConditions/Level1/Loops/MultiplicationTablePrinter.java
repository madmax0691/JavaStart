package HomeWorkLoopsConditions.Level1.Loops;

//        Вывести на экран таблицу умножения размера size.
//        На пересечении строки x и столбца y (нумерация с 1) находится число x * y
public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        printMultiplicationTable(3);
        printMultiplicationTable(-3);
    }

    public static void printMultiplicationTable(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size > 0");
        }
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
            for (int j = 2; j <= size; j++) {
                System.out.print(i * j + " ");
                if (j == size) {
                    System.out.println();
                }
            }
        }
    }
}
//        Test
/*
Exception in thread "main" java.lang.IllegalArgumentException: size > 0
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.MultiplicationTablePrinter.printMultiplicationTable(MultiplicationTablePrinter.java:11)
        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Loops.MultiplicationTablePrinter.main(MultiplicationTablePrinter.java:7)
        1 2 3
        2 4 6
        3 6 9

        Process finished with exit code 1*/
