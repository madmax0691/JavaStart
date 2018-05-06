public class LuckyTickets2 {
    public static void main(String[] args) {
        long lucky = 0;
        for (long i = 0; i <= 999_999_999_9L; i++) {
            long sum1 = 0, sum2 = 0;
            long numbers[] = new long[10];
            long ten = 1L;
            for (int j = 0; j <= 9; j++) {
                numbers[j] = i / ten % 10L;
                ten *= 10L;
            }
            for (int k = 0; k <= 9; k++) {
                sum1 += numbers[k];
                sum2 += numbers[k];
            }
            if (sum1 == sum2) {
                lucky += 1;
            }

        }
        System.out.println(lucky);
    }
}
