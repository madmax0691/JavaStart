package HomeWorkArraysMethods.Level0;

//Создать метод, находящий последний символ в строке.
// Если строка пустая, бросить исключение IllegalArgumentException.
//char lastChar(String s)

public class Method3 {
    public static void main(String[] args) {
        System.out.print(lastChar("mad"));
    }

    public static char lastChar(String s) {
        if (s.length() == 0) {
            throw new IllegalArgumentException();
        }
        return s.charAt(s.length() - 1);
    }
}
/*

d
Process finished with exit code 0
*/
