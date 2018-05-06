package HomeWorkLoopsConditions.Level0;

//Даны числа int a, b, c. Найти наименьшее
public class Condition3 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 100;
        int num3 = -30;
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            System.out.println(num2);
        }
    }
}
/*
-30
Process finished with exit code 0
*/
