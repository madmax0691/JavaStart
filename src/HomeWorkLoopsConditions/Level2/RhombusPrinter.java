package HomeWorkLoopsConditions.Level2;

//Вывести в консоль ромб размера size. Формат вывода смотрите в примере.

public class RhombusPrinter {
    public static void main(String[] args) {

        printRhombus(9);
    }

    public static void printRhombus(int size) {
        if (size <= 0 || size % 2 == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                //Чтобы не упасть в ужас, объясняю: я разбил ромб на все возможные участки и задал условия для всех возможных частей.
                // Можно отследить участки, если читать условия от || до ||
                if ((i == 1 && j == size / 2 + 1) || (i == size / 2 + 1 && j == 1) ||
                        (i == size && j == size / 2 + 1) || (i == size / 2 + 1 && j == size) ||
                        ((i > 1 && j < size / 2 + 1) && (j == (size / 2 + 1) - (i - 1))) || ((i > 1 && j > size / 2 + 1) && (j == (size / 2 + 1) + (i - 1)))
                        || ((i > size / 2 + 1 && j > size / 2 + 1) && (j == (size / 2 + 1) + (size - i))) ||
                        ((i > size / 2 + 1 && j < size / 2 + 1) && (j == (size / 2 + 1) - (size - i)))) {
                    System.out.print("*\t");
                }
                if (((i < size / 2 + 1) && (j <= ((size / 2 + 1) - i))) || (((i > 1 && i <= size / 2 + 1) && j > (size / 2 + 1) - (i - 1)) &&
                        j < (size / 2 + 1) + (i - 1)) || (i == size && j < size / 2 + 1) || (i == 1 && j > size / 2 + 1) ||
                        (i == size && j > size / 2 + 1) || (i < size / 2 + 1) && (j >= ((size / 2 + 1) + i)) ||
                        ((i > size / 2 + 1) && (j < ((size / 2 + 1) - (size - i)))) || ((i > size / 2 + 1) && (j > ((size / 2 + 1) + (size - i)))) ||
                        (((i > size / 2 + 1 && i <= size) && j > (size / 2 + 1) - (size - i)) && j < (size / 2 + 1) + (size - i))) {
                    System.out.print(".\t");
                }
                if (j == size) {
                    System.out.println();
                }
            }
        }
    }
}
//Test
/* printRhombus(7)
.	.	.	*	.	.	.
.	.	*	.	*	.	.
.	*	.	.	.	*	.
*	.	.	.	.	.	*
.	*	.	.	.	*	.
.	.	*	.	*	.	.
.	.	.	*	.	.	.

Process finished with exit code 0*/

/* printRhombus(5)
.	.	*	.	.
.	*	.	*	.
*	.	.	.	*
.	*	.	*	.
.	.	*	.	.

Process finished with exit code 0*/
/*  printRhombus(4)
    Exception in thread "main" java.lang.IllegalArgumentException
        at HomeWorkLoopsConditions.Level2.RhombusPrinter.printRhombus(RhombusPrinter.java:13)
        at HomeWorkLoopsConditions.Level2.RhombusPrinter.main(RhombusPrinter.java:8)

        Process finished with exit code 1*/


