package HomeWorkLoopsConditions.Level0;

//Вывести в консоль числа 300, 250, 200, … -200
public class Loop4 {
    public static void main(String[] args) {
        for (int i = 300; i >= -200; i -= 50) {
            System.out.print(i + " ");
        }
    }
}
/*
300 250 200 150 100 50 0 -50 -100 -150 -200
        Process finished with exit code 0*/
