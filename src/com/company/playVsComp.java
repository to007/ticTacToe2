package com.company;
import java.util.Scanner;
import static com.company.Main.board;
public class playVsComp {
    public static void main3() {
        int x, y;
        String dino = "O";
        String bear = "X";
        Scanner input = new Scanner(System.in);
        boolean pTurn;
        String response2;
        System.out.println("Will the player or the computer go first?");
        response2 = input.nextLine();
        if (response2.equalsIgnoreCase("player")) {
            pTurn = true;
        } else if (response2.equalsIgnoreCase("computer")) {
            pTurn = false;
        } else {
            System.out.println("Invalid response so the player will go first.");
            pTurn = true;
        }
        while (Main.checkRemainSpace()) {
            if (pTurn) {
                Main.showBoard();
                System.out.println("What row would you like to place in... 0,1,2");
                x = input.nextInt();
                if(x != 0 || x != 1 || x != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("The Computer has won the game!");
                    break;
                }
                System.out.println("What column would you like to place in... 0,1,2");
                y = input.nextInt();
                if(y != 0 || y != 1 || y != 2){
                    System.out.println("Nice try xX dpenne Xx, you lose! Enter an allowed input next time!");
                    System.out.println("The Computer has won the game!");
                    break;
                }
                if (board[x][y].equals(" ")) {
                    board[x][y] = "X";
                    if (Main.checkWinner()) {
                        System.out.println("The Player has won the game!");
                        Main.showBoard();
                        break;
                    }
                    if (!(Main.checkRemainSpace())) {
                        System.out.println("The game has ended in a draw!");
                        Main.showBoard();
                    }
                    pTurn = false;
                } else {
                    System.out.println("That spot is taken choose another one");
                }
            } else if (!(pTurn)) {
                Main.showBoard();
                    if(AI.winningMove(board, dino)) {
                    }else if(AI.blockWin(board, dino, bear)) {
                    }else if(AI.center(board, dino)) {
                    }else if(AI.oppoCorner(board, dino, bear)) {
                    }else if(AI.empCorner(board, dino)) {
                    }else if(AI.empSide(board, dino)) {
                    }
                    if (Main.checkWinner()) {
                        System.out.println("The Computer has won the game!");
                        Main.showBoard();
                        break;
                    }
                    if (!(Main.checkRemainSpace())) {
                        System.out.println("The game has ended in a draw!");
                        Main.showBoard();
                    }
                    pTurn = true;
                }
            }
        }
    }

