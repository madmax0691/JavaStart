package HomeWorkArraysMethods.Level2;

//Определить длину самой длинной последовательности повторяющихся элементов.
//Например, в массиве [1, 2, 2, 2, 3, 2, 4] самой длинной последовательностью будет [2, 2, 2].
//Если массив пустой, вернуть 0

public class LongestSequenceFinder {
    public static void main(String[] args) {
        int demoArray[] = {1, 2, 2, 2, 3, 2, 4};
        int demoArrayTwo[] = {1, 2, 2, 2, 3, 2, 4, 5, 5, 5, 5, 5, 5, 5, 4, 5};
        System.out.println(longestSequence(demoArray));
        System.out.println(longestSequence(demoArrayTwo));
    }

    public static int longestSequence(int[] array) {
        int maxCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int counter = 0;
            for (int j = i; array[i] == array[j]; j++) {
                counter++;
                if (j == array.length - 1) {
                    break;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        return maxCounter;
    }
}
/*

3
7

Process finished with exit code 0
*/
