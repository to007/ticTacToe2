package com.company;
import java.util.Scanner;

import static com.company.Main.board;

public class playVsPlay {
    public static void main2() {
        int x, y;
        Scanner input = new Scanner(System.in);
        boolean p1Turn;
        String response2;
        System.out.println("Which player will go first? ... 1 or 2");
        response2 = input.nextLine();
        if (response2.equalsIgnoreCase("1")) {
            p1Turn = true;
        } else if (response2.equalsIgnoreCase("2")) {
            p1Turn = false;
        } else {
            System.out.println("I wanted a number so and you did not give one so p1 is first.");
            p1Turn = true;
        }
        while (Main.checkRemainSpace()) {
            if (p1Turn) {
                Main.showBoard();
                System.out.println("Player 1 what row would you like to place in... 0,1,2");
                x = input.nextInt();
                if(x != 0 || x != 1 || x != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("Player 2 has won the game!");
                    break;
                }
                System.out.println("Player 1 what column would you like to place in... 0,1,2");
                y = input.nextInt();
                if(y != 0 || y != 1 || y != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("Player 2 has won the game!");
                    break;
                }
                if (board[x][y].equals(" ")) {
                    board[x][y] = "X";
                    if (Main.checkWinner()) {
                        System.out.println("Player 1 has won the game!");
                        Main.showBoard();
                        break;
                    }
                    if (!(Main.checkRemainSpace())) {
                        System.out.println("The game has ended in a draw!");
                        Main.showBoard();
                    }
                    p1Turn = false;
                } else {
                    System.out.println("That spot is taken choose another one");
                }
            } else if (!(p1Turn)) {
                Main.showBoard();
                System.out.println("Player 2 what row would you like to place in... 0,1,2");
                x = input.nextInt();
                if(x != 0 || x != 1 || x != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("Player 1 has won the game!");
                    break;
                }
                System.out.println("Player 2 what column would you like to place in... 0,1,2");
                y = input.nextInt();
                if(y != 0 || y != 1 || y != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("Player 2 has won the game!");
                    break;
                }
                if (board[x][y].equals(" ")) {
                    board[x][y] = "O";
                    if (Main.checkWinner()) {
                        System.out.println("Player 2 has won the game!");
                        Main.showBoard();
                        break;
                    }
                    if (!(Main.checkRemainSpace())) {
                        System.out.println("The game has ended in a draw!");
                        Main.showBoard();
                    }
                    p1Turn = true;
                } else {
                    System.out.println("That spot is taken choose another one");
                }
            }
        }
    }
}