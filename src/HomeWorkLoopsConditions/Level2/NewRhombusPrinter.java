package HomeWorkLoopsConditions.Level2;

//Вывести в консоль ромб размера size. Формат вывода смотрите в примере.

public class NewRhombusPrinter {
    public static void main(String[] args) {
        printRhombus(7);
    }

    public static void printRhombus(int size) {
        if (size <= 0 || size % 2 == 0) {
            throw new IllegalArgumentException();
        }

        int halfOfRhombus = size / 2; //центр ромба.
        // до оси симметрии по Y
        for (int i = 0; i < halfOfRhombus; i++) {
            for (int j = 0; j <= size - 1; j++) {
                if ((j == halfOfRhombus - i) || (j == halfOfRhombus + i)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();
        }
        //после оси симметрии по Y
        for (int i = halfOfRhombus; i >= 0; i--) {
            for (int j = 0; j <= size - 1; j++) {
                if ((j == halfOfRhombus - i) || (j == halfOfRhombus + i)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();
        }
    }
}
//Test
/*

.	.	.	*	.	.	.
.	.	*	.	*	.	.
.	*	.	.	.	*	.
*	.	.	.	.	.	*
.	*	.	.	.	*	.
.	.	*	.	*	.	.
.	.	.	*	.	.	.

Process finished with exit code 0*/
