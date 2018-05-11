package HomeWorkLoopsConditions.Level1.Conditions;

//        Определить, является ли билетик ticket счастливым.
//        Номер билетика - целое 6-значное число.
//        Счастливый - это такой билетик, у которого сумма старших 3-х цифр и младших 3-х цифр совпадают.
public class LuckyTicket {
    public static void main(String[] args) {
        System.out.println("Ticket: 273534 " + isLuckyTicket(273534));
        System.out.println("Ticket: 111112 " + isLuckyTicket(111112));
        System.out.println("Ticket: 22222222 " + isLuckyTicket(22222222));
    }

    public static boolean isLuckyTicket(int ticket) {
        if (ticket < 0 || ticket > 999_999) {
            throw new IllegalArgumentException("ticket = 0 … 999999 " + ticket);
        }

        int number1 = ticket / 1 % 10;
        int number2 = ticket / 10 % 10;
        int number3 = ticket / 100 % 10;
        int sumFirst = number1 + number2 + number3;

        int number4 = ticket / 1000 % 10;
        int number5 = ticket / 10000 % 10;
        int number6 = ticket / 100000 % 10;
        int sumSecond = number4 + number5 + number6;

        return sumFirst == sumSecond;

    }
}
//Test
//        Ticket: 273534 true
//        Ticket: 111112 false
//        Exception in thread "main" java.lang.IllegalArgumentException: ticket = 0 … 999999 22222222
//        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Conditions.LuckyTicket.isLuckyTicket(LuckyTicket.java:14)
//        at HomeWorkLoopsConditions.HomeWorkArraysMethods.Level1.Conditions.LuckyTicket.main(LuckyTicket.java:9)