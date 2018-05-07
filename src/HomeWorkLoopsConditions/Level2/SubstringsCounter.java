package HomeWorkLoopsConditions.Level2;
//Посчитать, сколько раз строка substring встречается в строке s.
//Создавать новые строки запрещено

public class SubstringsCounter {
    public static void main(String[] args) {
        System.out.println(countSubstrings("Java JavaScript Kotlin Java", "Java"));
        System.out.println(countSubstrings("Java JavaScript Kotlin Java", "Python"));
        System.out.println(countSubstrings("Java", "Java JavaScript Kotlin Java"));
    }

    public static int countSubstrings(String s, String substring) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (substring.charAt(0) == s.charAt(i)) {
                int counter = 0;
                for (int j = 0, k = i; j < substring.length() && k < s.length(); j++, k++) {
                    if (substring.charAt(j) == s.charAt(k)) {
                        counter++;
                    }
                    if (counter == substring.length()) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
//Test
/*

3
0
0

Process finished with exit code 0*/
