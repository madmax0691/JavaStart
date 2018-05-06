package Lesson4;

public class LuckyTickets {
    public static void main(String[] args) {
        int luckyNumbers = 0;
        for (int i = 0; i <= 999_999; i++) {

            int number1 = i / 1 % 10;
            int number2 = i / 10 % 10;
            int number3 = i / 100 % 10;
            int sumFirst = number1 + number2 + number3;

            int number4 = i / 1000 % 10;
            int number5 = i / 10000 % 10;
            int number6 = i / 100000 % 10;
            int sumSecond = number4 + number5 + number6;

            if (sumFirst == sumSecond) {
                luckyNumbers += 1;
            }


        }
        System.out.println(luckyNumbers);
    }
}
