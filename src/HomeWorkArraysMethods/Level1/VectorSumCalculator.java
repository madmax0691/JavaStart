package HomeWorkArraysMethods.Level1;

//Выполнить векторное сложение двух массивов.
//Необходимо создать новый массив (например, res),
// длина которого равна длине меньшего входного массива, и заполнить его по принципу
//res[i] = a[i] + b[i]

import java.util.Arrays;

public class VectorSumCalculator {
    public static void main(String[] args) {
        int demoArray[] = {10, 30, 20};
        int demoArrayTwo[] = {2, 3};
        System.out.println(Arrays.toString(vectorSum(demoArray, demoArrayTwo)));
        System.out.print(Arrays.toString(vectorSum(demoArrayTwo, demoArray)));
    }

    public static int[] vectorSum(int[] a, int[] b) {
        int sizeMin = a.length;
        if (a.length > b.length) {
            sizeMin = b.length;
        }

        int res[] = new int[sizeMin];

        for (int index = 0; index < sizeMin; index++) {
            res[index] = a[index] + b[index];
        }

        return res;
    }
}
/*
[12, 33]
[12, 33]
Process finished with exit code 0
*/
