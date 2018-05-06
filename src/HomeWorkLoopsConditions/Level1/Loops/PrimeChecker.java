package HomeWorkLoopsConditions.Level1.Loops;

//        Определить, является ли число простым.
//        Простое число - это натуральное число (больше нуля), которое делится нацело только на себя и на 1
public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(151));
        System.out.println(isPrime(200));
    }

    public static boolean isPrime(int n) {
        System.out.println("For num: " + n);
        if (n <= 0) {
            throw new IllegalArgumentException("n must be more than 0");
        }
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter == 2;
    }
}
//        Test
//        For num: 1
//        false
//        For num: 2
//        true
//        For num: 151
//        true
//        For num: 200
//        false
//
//        Process finished with exit code 0