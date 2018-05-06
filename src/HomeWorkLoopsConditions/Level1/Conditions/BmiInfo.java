package HomeWorkLoopsConditions.Level1.Conditions;

//Вычислить BMI (индекс массы тела) человека по показателям веса (в килограммах) и роста (в метрах).
//        В результате вернуть текстовое описание BMI.
//        bmi = weight / height ^ 2, где ^ - возведение в степень.
//        Текстовое описание:
//        bmi <= 18.5                -> "Underweight"
//        18.5 < bmi <= 25.0     -> "Normal"
//        25.0 < bmi                  -> "Overweight"
//        Использовать конструкцию if-else-if
public class BmiInfo {
    public static void main(String[] args) {
        System.out.println("70.0, 1.75 " + bmiInfo(70.0, 1.75));
        System.out.println("-70.0, 1.75 " + bmiInfo(-70.0, 1.75));
        System.out.println("70.0, -1.75 " + bmiInfo(70.0, -1.75));
    }

    public static String bmiInfo(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("weight > 0, height > 0 ");
        }
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            return "\"Underweight\"";
        } else {
            if (18.5 < bmi && bmi <= 25.0) {
                return "\"Normal\"";
            } else {
                return "\"Overweight\"";
            }
        }
    }

}
//Test
//        70.0, 1.75 "Normal"
//        Exception in thread "main" java.lang.IllegalArgumentException: weight > 0, height > 0
//        at HomeWorkLoopsConditions.Level1.Conditions.BmiInfo.bmiInfo(BmiInfo.java:18)
//        at HomeWorkLoopsConditions.Level1.Conditions.BmiInfo.main(BmiInfo.java:13)