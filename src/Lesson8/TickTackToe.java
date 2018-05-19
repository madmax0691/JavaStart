package Lesson8;

//Реализовать консольную программу "Крестики-нолики 3x3".
//Играют 2 игрока, поочередно вводят свои хода в виде координат.
//Программа предоставляет отображение доски в консоли, возможность ввода и проверку победителя.

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
        System.out.print("X: ");
        for (int i = 0; i < arrayDemo.length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("Y:");
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
            int y = sc.nextInt();
            System.out.println("Player" + playerInfo + ", enter Y: ");
            int x = sc.nextInt();
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
                if ((j == arrayDemo.length - 1) && counterVertical == arrayDemo.length) {
                    return true;
                }
            }
        }
        //проверка по диагонали
        int counterDiagonal = 0;
        int counterMirroredDiagonal = 0;
        for (int i = 0, j = arrayDemo.length - 1; i < arrayDemo.length; i++, j--) {
            if (arrayDemo[i][j].equals(playerIndex)) {
                counterMirroredDiagonal++;
            }
            if ((i == arrayDemo.length - 1) && counterMirroredDiagonal == arrayDemo.length) {
                return true;
            }
        }
        for (int i = 0; i < arrayDemo.length; i++) {
            if (arrayDemo[i][i].equals(playerIndex)) {
                counterDiagonal++;
            }
            if ((i == arrayDemo.length - 1) && counterDiagonal == arrayDemo.length) {
                return true;
            }
        }
        //возврат по умолчанию
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
        scanner.close();

    }
}
/*

Let's play:
PlayerOne: '*'
PlayerTwo: '~'
X: 0  1  2  3  4  Y:
   -  -  -  -  -  0
   -  -  -  -  -  1
   -  -  -  -  -  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerOne, enter X:
4
PlayerOne, enter Y:
0
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  -  -  1
   -  -  -  -  -  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerTwo, enter X:
4
PlayerTwo, enter Y:
1
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  -  ~  1
   -  -  -  -  -  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerOne, enter X:
3
PlayerOne, enter Y:
1
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  -  -  -  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerTwo, enter X:
4
PlayerTwo, enter Y:
1
Oops, cell is already taken, please use valid coordinates!
PlayerTwo, enter X:
5
PlayerTwo, enter Y:
1
Incorrect input value, please use valid coordinates!
PlayerTwo, enter X:
4
PlayerTwo, enter Y:
2
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  -  -  ~  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerOne, enter X:
2
PlayerOne, enter Y:
2
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  *  -  ~  2
   -  -  -  -  -  3
   -  -  -  -  -  4
PlayerTwo, enter X:
4
PlayerTwo, enter Y:
3
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  *  -  ~  2
   -  -  -  -  ~  3
   -  -  -  -  -  4
PlayerOne, enter X:
1
PlayerOne, enter Y:
3
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  *  -  ~  2
   -  *  -  -  ~  3
   -  -  -  -  -  4
PlayerTwo, enter X:
3
PlayerTwo, enter Y:
3
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  *  -  ~  2
   -  *  -  ~  ~  3
   -  -  -  -  -  4
PlayerOne, enter X:
0
PlayerOne, enter Y:
4
X: 0  1  2  3  4  Y:
   -  -  -  -  *  0
   -  -  -  *  ~  1
   -  -  *  -  ~  2
   -  *  -  ~  ~  3
   *  -  -  -  -  4
Winner is playerOne!!!
Thank you for playing!

Process finished with exit code 0
*/
