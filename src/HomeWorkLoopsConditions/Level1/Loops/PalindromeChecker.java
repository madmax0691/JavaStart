package HomeWorkLoopsConditions.Level1.Loops;

//        Определить, является ли строка палиндромом.
//        Палиндром - строка, которая с двух сторон читается одинаково.
//        Создавать новые строки запрещено
public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("apple"));
        System.out.println(isPalindrome("Madam"));
    }

    public static boolean isPalindrome(String s) {
        System.out.print("For String: " + s + " - ");
        int counter = 0;
        for (int i = 0, j = s.length() - 1; i < s.length() && j > 0; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                counter++;
            }
        }
        return counter == 0;
    }
}
//        Test
//        For String: madam - true
//        For String: apple - false
//        For String: Madam - false
//
//        Process finished with exit code 0