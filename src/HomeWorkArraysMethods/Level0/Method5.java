package HomeWorkArraysMethods.Level0;

//Создать метод, печатающий четные числа  от from до to.
// Если from > to, бросить исключение IllegalArgumentException.
//void printEvens(int from, int to)


public class Method5 {
    public static void main(String[] args) {
        printEvens(1, 7);
    }

    public static void printEvens(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException();
        }
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*

2 4 6
Process finished with exit code 0

*/
