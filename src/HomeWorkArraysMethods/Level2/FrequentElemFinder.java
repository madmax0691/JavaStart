package HomeWorkArraysMethods.Level2;

//Найти самый повторяющийся элемент в массиве.
// Если таких элементов несколько, вернуть первый.

public class FrequentElemFinder {
    public static void main(String[] args) {
        int demoArray[] = {4, 5, 2, 5, 0, 3};
        int demoArrayTwo[] = {4, 2, 5, 2, 5, 0, 3};
        int demoArrayThird[] = {};

        System.out.println(frequentElem(demoArray));
        System.out.println(frequentElem(demoArrayTwo));
        System.out.print(frequentElem(demoArrayThird));

    }

    public static int frequentElem(int[] array) {
        if (array.length <= 0) {
            throw new IllegalArgumentException();
        }

        int elem = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter >= 2) {
                elem = array[i];
                break;
            }
        }
        return elem;
    }
}
/*

5
2
Exception in thread "main" java.lang.IllegalArgumentException
	at HomeWorkArraysMethods.Level2.FrequentElemFinder.frequentElem(FrequentElemFinder.java:20)
	at HomeWorkArraysMethods.Level2.FrequentElemFinder.main(FrequentElemFinder.java:14)

Process finished with exit code 1
*/
