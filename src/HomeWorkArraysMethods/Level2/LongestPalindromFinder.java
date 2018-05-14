package HomeWorkArraysMethods.Level2;

//Последовательность считается палиндромом, если она симметрична относительно своей середины
// (элементы в прямом и обратном порядке составляют одну и ту же последовательность).
//Примеры палиндромов: [1, 3, 2, 2, 3, 1], [2], [4, 4, 4], [].
//Определить длину самого длинного палиндрома внутри массива.
// Например, массив [4, 1, 3, 2, 2, 3, 1, 4, 4, 1] содержит палиндромы [1, 3, 2, 2, 2, 3, 1] и [1, 4, 4, 1]
// (это не все палиндромы), размер самого длинного 8.
//Если массив пустой, вернуть 0


public class LongestPalindromFinder {
    public static void main(String[] args) {
        int demoArray[] = {4, 1, 3, 2, 2, 3, 1, 4, 4, 1};
        int demoArrayTwo[] = {1, 2, 3, 4, 5};
        int demoArrayThird[] = {};

        System.out.println(longestPalindrom(demoArray));
        System.out.println(longestPalindrom(demoArrayTwo));
        System.out.println(longestPalindrom(demoArrayThird));
    }

    public static int longestPalindrom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[i] == array[j]) {
                    int counter = 0;
                    for (int k = i, l = j; k <= j; k++, l--) {
                        if (array[k] == array[l]) {
                            counter++;
                        }
                    }
                    if ((counter) == (array.length) - (i + ((array.length - 1) - j))) {
                        return counter;
                    }
                    if (counter == 1) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
/*

8
1
0

Process finished with exit code 0
*/
