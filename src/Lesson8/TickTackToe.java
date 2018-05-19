package Lesson8;

import java.util.Scanner;

public class TickTackToe {
    String argument[][] = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"},
    };
    String playerOne;
    String playerTwo;

    TickTackToe() {
        playerOne = "*";
        playerTwo = "~";
    }

    void showTable(String arrayDemo[][]) {
        for (int i = 0; i < arrayDemo.length; i++) {
            for (int j = 0; j < arrayDemo.length; j++) {
                System.out.print(arrayDemo[i][j] + "  ");
                if (j == arrayDemo.length - 1) {
                    System.out.println();
                }
            }
        }
    }

    String[][] setToken(Scanner sc, String playerIndex, String arrayDemo[][]) {
        String playerInfo;
        if (playerIndex.equals("*")) {
            playerInfo = "One";
        } else {
            playerInfo = "Two";
        }
        System.out.println("Player" + playerInfo + ", enter X: ");
        int x = sc.nextInt();
        System.out.println("Player" + playerInfo + ", enter Y: ");
        int y = sc.nextInt();

        arrayDemo[x][y] = playerIndex;

        sc.close();
        return arrayDemo;
    }

    boolean isWinner(String playerIndex, String arrayDemo[][]) {
        //проверка по горизонтали и вертикали
        for (int i = 0; i < arrayDemo.length; i++) {
            int counterHorizontal = 0;
            int counterVertical = 0;
            for (int j = 0; j < arrayDemo.length; j++) {
                if (arrayDemo[i][j].equals(playerIndex)) {
                    counterHorizontal++;
                }
                if (arrayDemo[j][i].equals(playerIndex)) {
                    counterVertical++;
                }
                if ((j == arrayDemo.length - 1) && counterHorizontal == arrayDemo.length) {
                    return true;
                }
                if (i == arrayDemo.length - 1 && counterVertical == arrayDemo.length) {
                    return true;
                }
            }
        }
        return false;
    }


}

class TickTackToeDemo {
    public static void main(String[] args) {
        TickTackToe tk = new TickTackToe();
        Scanner scanner = new Scanner(System.in);
        tk.setToken(scanner, tk.playerOne, tk.argument);
        tk.showTable(tk.argument);

    }
}
