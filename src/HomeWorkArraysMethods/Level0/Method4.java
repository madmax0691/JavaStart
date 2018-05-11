package HomeWorkArraysMethods.Level0;

//Создать метод, подсчитывающий сумму всех чисел от from до to: from + (from+1) + (from+2) + … + to.
// Если from > to, бросить исключение IllegalArgumentException.
//int rangeSum(int from, int to)


public class Method4 {
    public static void main(String[] args) {
        System.out.print(rangeSum(1, 7));
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
/*

28
Process finished with exit code 0

*/
