package HomeWorkLoopsConditions.Level1.Conditions;

//        Определить, какой прямоугольник больше по площади.
//        Если больше первый прямоугольник, то результат 1, иначе 2.
public class BiggerRectangle {
    public static void main(String[] args) {
        System.out.println(biggerRectange(10, 20, 40, 30));
        System.out.println(biggerRectange(10, -20, 40, 30));
    }

    public static int biggerRectange(int widht1, int height1, int width2, int height2) {

        if (widht1 < 0 || height1 < 0 || width2 < 0 || height2 < 0) {
            throw new IllegalArgumentException("widht1, height1, width2, height2 > 0 " + widht1
                    + " " + height1 + " " + width2 + " " + height2);
        }

        double squareOne = 0.5 * widht1 * height1;
        double squareTwo = 0.5 * width2 * height2;

        if (squareOne > squareTwo) {
            return 1;
        } else {
            return 2;
        }

    }

}
//        Test:
//        2
//        Exception in thread "main" java.lang.IllegalArgumentException: widht1, height1, width2, height2 > 0 10 -20 40 30
//        at HomeWorkLoopsConditions.Level1.Conditions.BiggerRectangle.biggerRectange(BiggerRectangle.java:12)
//        at HomeWorkLoopsConditions.Level1.Conditions.BiggerRectangle.main(BiggerRectangle.java:7)