package Lesson2;

public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 102; // Input: any valid number of likes
        int registrationYear = 2018; // Input: any valid registration year
        int currentYear = java.time.Year.now().getValue();
        double likesPerYear; // Your formula
        likesPerYear = likesCount / (double) (currentYear - (registrationYear - 1));
        System.out.println(currentYear);
        System.out.println(likesPerYear + " likes / year");
    }
}