package HomeWorkLoopsConditions.Level0;

//Даны числа int a, b. Вывести -1, если a < b; 0, если a == b; +1, если a > b.
public class Condition4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        if (a < b) {
            System.out.println("-1");
        } else {
            if (a > b) {
                System.out.println("+1");
            } else {
                System.out.println("0");
            }
        }
    }
}
/*
+1
Process finished with exit code 0
*/
