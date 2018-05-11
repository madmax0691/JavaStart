package HomeWorkArraysMethods.Level1;

//Определить, является ли массив отсортированным по возрастанию

import java.util.Arrays;

public class SortedChecker {
    public static void main(String[] args) {
        int demoArray[] = {10, 20, 50};
        int demoArrayTwo[] = {10, 10, 10};
        int demoArrayThird[] = {10, 50, 20};

        System.out.println(isSorted(demoArray));
        System.out.println(isSorted(demoArrayTwo));
        System.out.print(isSorted(demoArrayThird));

    }

    public static boolean isSorted(int[] array) {
        int sortedArray[] = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);
        Arrays.sort(sortedArray);
        return Arrays.compare(array, sortedArray) == 0;
    }
}
/*

true
true
false
Process finished with exit code 0
*/
