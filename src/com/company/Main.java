package com.company;
import java.util.Scanner;



public class Main {
    public static String[][] board = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    public static void main(String[] args) {
        String response1 = "";
        Scanner input = new Scanner(System.in);
            System.out.println("Which game mode would you like to play");
            System.out.println("1: Player vs Player");
            System.out.println("2: Player vs Computer");
            System.out.println("3: Computer vs Computer");
        response1 = input.nextLine();
        if(response1.equalsIgnoreCase("1")){
            playVsPlay.main2();
        }else if(response1.equalsIgnoreCase("2")){
            playVsComp.main3();
        }else if(response1.equalsIgnoreCase("3")){
            CompVsComp.main4();
        }
        if(!(response1.equals("1") || response1.equals("2") || response1.equals("3"))) {
            System.out.println("invalid response... you get to play Player vs Player, next time enter a number.");
            playVsPlay.main2();
        }
    }
    public static void showBoard(){
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("___|___|___");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("___|___|___");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("   |   |   ");
    }
    public static boolean checkWinner(){
        if(board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]) && !(board[0][0].equals(" "))){
            return true;
        }else if(board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])&& !(board[0][1].equals(" "))){
            return true;
        }else if(board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2])&& !(board[0][2].equals(" "))){
            return true;
        }else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])&& !(board[0][0].equals(" "))){
            return true;
        }else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])&& !(board[1][0].equals(" "))){
            return true;
        }else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2])&& !(board[2][0].equals(" "))){
            return true;
        }else if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])&& !(board[0][0].equals(" "))){
            return true;
        }else if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])&& !(board[0][2].equals(" "))){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkRemainSpace(){
        return board[0][0].equals(" ") || board[0][1].equals(" ") || board[0][2].equals(" ") || board[1][0].equals(" ") || board[1][1].equals(" ") || board[1][2].equals(" ") || board[2][0].equals(" ") || board[2][1].equals(" ") || board[2][2].equals(" ");
    }
}
