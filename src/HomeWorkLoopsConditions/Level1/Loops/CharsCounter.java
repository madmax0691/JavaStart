package HomeWorkLoopsConditions.Level1.Loops;

//Посчитать, сколько раз символ ch встречается в строке s
public class CharsCounter {
    public static void main(String[] args) {
        System.out.println(countChars("Hello, world!", 'o'));
        System.out.println(countChars("", '1'));
    }

    public static int countChars(String s, char ch) {
        System.out.println("For :" + s + ", " + ch);
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
}
//        Test
//        For :Hello, world!, o
//        2
//        For :, 1
//        0
//
//        Process finished with exit code 0