package HomeWorkArraysMethods.Level2;

//Массив считается сбалансированным, если его можно разделить на две части так,
// что сумма элементов левой части равна сумме элементов правой части.
// Например, массив [1, 1, 1, 2, 1] можно разделить на две части [1, 1, 1] и [2, 1],
// сумма элементов обеих частей равна 3, соответственно массив является сбалансированным.
//Определить, является ли массив сбалансированным

public class BalanceChecker {
    public static void main(String[] args) {
        int demoArray[] = {1, 1, 1, 2, 1};
        int demoArrayTwo[] = {2, 1, 1, 2, 1};
        int demoArrayThird[] = {1, 1};
        int demoArrayFour[] = {};

        System.out.println(isBalanced(demoArray));
        System.out.println(isBalanced(demoArrayTwo));
        System.out.println(isBalanced(demoArrayThird));
        System.out.println(isBalanced(demoArrayFour));
    }

    public static boolean isBalanced(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < array.length - 1; i++) {
            int sumOne = 0;
            int sumTwo = 0;
            for (int j = 0; j <= i; j++) {
                sumOne += array[j];
            }
            for (int j = array.length - 1; j > i; j--) {
                sumTwo += array[j];
            }
            if (sumOne == sumTwo) {
                return true;
            }
        }
        return false;
    }
}
/*

true
false
true
Exception in thread "main" java.lang.IllegalArgumentException
	at HomeWorkArraysMethods.Level2.BalanceChecker.isBalanced(BalanceChecker.java:24)
	at HomeWorkArraysMethods.Level2.BalanceChecker.main(BalanceChecker.java:19)

Process finished with exit code 1
*/
