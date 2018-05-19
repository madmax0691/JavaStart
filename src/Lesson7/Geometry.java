package Lesson7;

public class Geometry {
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(30, 20));

        System.out.println(circleArea(10));
        System.out.println(circleArea(20));
        System.out.println(circleArea(-10));

    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("input corretct arguments");
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
