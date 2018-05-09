package HomeWorkLoopsConditions.Level2;

//Вывести в консоль равносторонний треугольник размера size.
// Формат вывода смотрите в примере

public class EquilateralTrianglePrinter {
    public static void main(String[] args) {
        printEquilateralTriangle(4);
        printEquilateralTriangle(8);
        printEquilateralTriangle(-4);
    }

    public static void printEquilateralTriangle(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size > 0");
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size + (size - 1)); j++) {
                if ((j <= (size - i)) || (j > ((size + (size - 1)) - (size - i)))) {
                    System.out.print(" ");
                }
                if ((j > (size - i)) && (j <= ((size + (size - 1)) - (size - i)))) {
                    System.out.print("^");
                }
            }
            System.out.println();
        }
    }
}
//Test
/* ^
  ^^^
 ^^^^^
^^^^^^^
       ^
      ^^^
     ^^^^^
    ^^^^^^^
   ^^^^^^^^^
  ^^^^^^^^^^^
 ^^^^^^^^^^^^^
^^^^^^^^^^^^^^^
Exception in thread "main" java.lang.IllegalArgumentException: size > 0
	at HomeWorkLoopsConditions.Level2.EquilateralTrianglePrinter.printEquilateralTriangle(EquilateralTrianglePrinter.java:14)
	at HomeWorkLoopsConditions.Level2.EquilateralTrianglePrinter.main(EquilateralTrianglePrinter.java:9)

Process finished with exit code 1
*/
