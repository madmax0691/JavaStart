package HomeWorkArraysMethods.Level0;

//Создать метод, определяющий, является ли число возрастом. Возраст человека - число от 1 до 120.
//boolean isAge(int n)

public class Method2 {
    public static void main(String[] args) {
        System.out.print(isAge(2));
    }

    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
/*

true
Process finished with exit code 0
*/
