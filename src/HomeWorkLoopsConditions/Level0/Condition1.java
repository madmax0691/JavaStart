package HomeWorkLoopsConditions.Level0;

//Дан день недели int day. Вывести “weekday”, если день будний, или “weekend”, если день выходной.
public class Condition1 {
    public static void main(String[] args) {
        int day = 5;
        if (day < 6) {
            System.out.println("weekday");
        } else {
            System.out.println("weekend");
        }
    }
}
/*
weekday
Process finished with exit code 0
*/
