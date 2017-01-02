package com.company;

import static com.company.Main.board;
public class CompVsComp {

    public static void main4() {
        boolean pTurn = true;
        String dino = "O";
        String bear = "X";
        while (Main.checkRemainSpace()) {
            if (pTurn) {
                Main.showBoard();
                if(AI.winningMove(board, bear)) {
                }else if(AI.blockWin(board, bear, dino)) {
                }else if(AI.center(board, bear)) {
                }else if(AI.oppoCorner(board, bear, dino)) {
                }else if(AI.empCorner(board, bear)) {
                }else if(AI.empSide(board, bear)){
                }
                    if (Main.checkWinner()) {
                        System.out.println("The First Computer has won the game!");
                        Main.showBoard();
                        break;
                    }
                if (!(Main.checkRemainSpace())) {
                    System.out.println("The game has ended in a draw!");
                    Main.showBoard();
                }
                pTurn = false;
            } else if (!(pTurn)) {
                Main.showBoard();
                if(AI.winningMove(board, dino)) {
                }else if(AI.blockWin(board, dino, bear)) {
                }else if(AI.center(board, dino)) {
                }else if(AI.oppoCorner(board, dino, bear)) {
                }else if(AI.empCorner(board, dino)) {
                }else if(AI.empSide(board, dino)){
                }
                    if (Main.checkWinner()) {
                        System.out.println("The Second Computer has won the game!");
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
