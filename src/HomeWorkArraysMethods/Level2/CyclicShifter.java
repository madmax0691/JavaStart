package HomeWorkArraysMethods.Level2;

//Выполнить циклический сдвиг массива на количество позиций shiftPositions.
//Если shiftPositions > 0 - сдвиг вправо,
// shiftPositions < 0 - сдвиг влево, shiftPositions = 0 - сдвига нет

import java.util.Arrays;

public class CyclicShifter {
    public static void main(String[] args) {
        int demoArray[] = {0, 1, 2, 3, 4};
        int demoArrayTwo[] = {0, 1, 2, 3, 4};
        int demoArrayThird[] = {0, 1, 2, 3, 4};
        int demoArrayFour[] = {0, 1, 2, 3, 4};

        cyclicShift(demoArray, 1);
        cyclicShift(demoArrayTwo, -1);
        cyclicShift(demoArrayThird, 0);
        cyclicShift(demoArrayFour, 5);
    }

    public static void cyclicShift(int[] array, int shiftPositions) {
        int shiftedArray[] = new int[array.length];
        if (shiftPositions > 0 && shiftPositions < array.length) {
            for (int i = 0; i < shiftPositions; i++) {
                shiftedArray[i] = array[(array.length - 1) - i];
            }
            for (int i = shiftPositions; i < array.length; i++) {
                shiftedArray[i] = array[i - shiftPositions];
            }
        }
        if (shiftPositions < 0) {
            for (int i = 0; i < shiftPositions; i++) {
                shiftedArray[i] = array[(array.length - 1) - i];
            }
            for (int i = 0; i < array.length - 1; i++) {
                shiftedArray[i] = array[i + 1];
            }
        }
        if (shiftPositions == 0 || shiftPositions == array.length) {
            for (int i = 0; i < array.length; i++) {
                shiftedArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(shiftedArray));
    }
}
/*
[4, 0, 1, 2, 3]
[1, 2, 3, 4, 0]
[0, 1, 2, 3, 4]
[0, 1, 2, 3, 4]

Process finished with exit code 0
*/
