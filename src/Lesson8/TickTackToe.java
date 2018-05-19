package Lesson8;

import java.util.Scanner;

public class TickTackToe {
    String argument[][] = {
            {"-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-"},
    };
    String playerOne;
    String playerTwo;

    TickTackToe() {
        playerOne = "*";
        playerTwo = "~";
    }

    void showTable(String arrayDemo[][]) {
        System.out.print("Y: ");
        for (int i = 0; i < arrayDemo.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("X:");
        for (int i = 0; i < arrayDemo.length; i++) {
            System.out.print("   ");
            for (int j = 0; j < arrayDemo.length; j++) {
                System.out.print(arrayDemo[i][j] + "  ");
                if (j == arrayDemo.length - 1) {
                    System.out.println(i);
                }
            }
        }
    }

    String[][] setToken(Scanner sc, String playerIndex, String arrayDemo[][]) {
        String playerInfo;
        if (playerIndex.equals(playerOne)) {
            playerInfo = "One";
        } else {
            playerInfo = "Two";
        }
        int counter = 0;
        do {
            System.out.println("Player" + playerInfo + ", enter X: ");
            int x = sc.nextInt();
            System.out.println("Player" + playerInfo + ", enter Y: ");
            int y = sc.nextInt();
            if ((((x < arrayDemo.length && x >= 0)) && (y < arrayDemo.length && y >= 0))) {
                if (((arrayDemo[x][y].equals(playerOne)) || (arrayDemo[x][y].equals(playerTwo))) != true) {
                    arrayDemo[x][y] = playerIndex;
                    counter++;
                } else {
                    System.out.println("Oops, cell is already taken, please use valid coordinates!");
                }
            } else {
                System.out.println("Incorrect input value, please use valid coordinates!");
            }

        } while (counter == 0);

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
        System.out.println("Let's play:");
        System.out.println("PlayerOne: " + "'" + tk.playerOne + "'");
        System.out.println("PlayerTwo: " + "'" + tk.playerTwo + "'");
        tk.showTable(tk.argument);
        do {
            tk.setToken(scanner, tk.playerOne, tk.argument);
            tk.showTable(tk.argument);
            if (tk.isWinner(tk.playerOne, tk.argument)) {
                System.out.println("Winner is playerOne!!!");
                break;
            }
            tk.setToken(scanner, tk.playerTwo, tk.argument);
            tk.showTable(tk.argument);
            if (tk.isWinner(tk.playerTwo, tk.argument)) {
                System.out.println("Winner is playerTwo!!!");
                break;
            }
        } while (tk.isWinner(tk.playerOne, tk.argument) == false && tk.isWinner(tk.playerTwo, tk.argument) == false);
        System.out.println("Thank you for playing!");

    }
}
