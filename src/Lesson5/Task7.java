package Lesson5;

public class Task7 {
    public static void main(String[] args) {
        String stringOne = "4";
        String stringTwo = "9";

        int numbersOne[] = new int[stringOne.length()];
        int numbersTwo[] = new int[stringTwo.length()];


        for (int i = 0; i < stringOne.length(); i++) {
            numbersOne[i] = Character.digit(stringOne.charAt(i), 10);
        }
        for (int i = 0; i < stringTwo.length(); i++) {
            numbersTwo[i] = Character.digit(stringTwo.charAt(i), 10);
        }

        for (int i = 0; i < stringOne.length(); i++) {
            System.out.print(numbersOne[i]);
        }
        int sum = 0;
        for (int i = numbersOne.length; i <= 0; i--) {
            int dec = (int) Math.pow(10, i);
            sum += numbersOne[i] * dec;
        }
        System.out.println(sum);
    }
}
