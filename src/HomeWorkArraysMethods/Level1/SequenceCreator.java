package HomeWorkArraysMethods.Level1;

//Создать массив, размером size, заполненный значениями 0, 1, 2 … (size-1)

import java.util.Arrays;

public class SequenceCreator {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createSequence(5)));
        System.out.println(Arrays.toString(createSequence(0)));
        System.out.println(Arrays.toString(createSequence(-5)));
    }

    public static int[] createSequence(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        int array[] = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = index;
        }
        return array;
    }
}
/*

[0, 1, 2, 3, 4]
[]
Exception in thread "main" java.lang.IllegalArgumentException
	at HomeWorkArraysMethods.Level1.SequenceCreator.createSequence(SequenceCreator.java:16)
	at HomeWorkArraysMethods.Level1.SequenceCreator.main(SequenceCreator.java:11)

Process finished with exit code 1
*/
