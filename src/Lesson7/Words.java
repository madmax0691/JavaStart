package Lesson7;

public class Words {
    public static void main(String[] args) {
        String demoArray[] = {"Mad", "Max", "World"};
        String demoArrayTwo[] = {"Mad", "Max", "World", ""};

        System.out.println(totalLength(demoArray) + " " + containsEmptyWord(demoArray));
        System.out.println(totalLength(demoArrayTwo) + " " + containsEmptyWord(demoArrayTwo));
    }

    public static int totalLength(String[] words) {
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        return sum;
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) {
            if (word.equals("")) {
                return true;
            }
        }
        return false;
    }
}
