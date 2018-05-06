package HomeWorkLoopsConditions.Level1.Conditions;

/*      Определить, сколько дней в месяце в не високосный год.
        Не использовать классы из стандартной библиотеки.
        Использовать конструкцию switch-case*/
public class DaysOfMonth {
    public static void main(String[] args) {
        System.out.println("Month: 4 " + daysOfMonth(4));
        System.out.println("Month: 2 " + daysOfMonth(2));
        System.out.println("Month: 20 " + daysOfMonth(20));
    }

    public static int daysOfMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month = 1 … 12 " + month);
        }
        switch (month) {
            case 2:
                return 24;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
        }
        return 31;
    }
}
//        Test
//        Month: 4 30
//        Month: 2 24
//        Exception in thread "main" java.lang.IllegalArgumentException: month = 1 … 12 20
//        at HomeWorkLoopsConditions.Level1.Conditions.DaysOfMonth.daysOfMonth(DaysOfMonth.java:13)
//        at HomeWorkLoopsConditions.Level1.Conditions.DaysOfMonth.main(DaysOfMonth.java:9)