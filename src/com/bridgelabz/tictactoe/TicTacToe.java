package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    char userInput = ' ';
    char compInput = ' ';

    static char[] board = new char[10];
    public void welcome() {
        System.out.println("Welcome to TicTacToe game");
    }
    public void uc1_CreateBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        System.out.println(" board: ");
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[4]+" | "+board[6]);
        System.out.println("----------");
        System.out.println(board[7]+" | "+board[9]+" | "+board[9]);
    }
    public void uc2_choosLetter() {
        System.out.println("Select letter X or O as your option: ");
        userInput = sc.next().charAt(0);
        if (userInput == 'X' || userInput == 'x') {
            compInput = 'O';
            System.out.println("Player option is X");
            System.out.println("Computer option is O");
        } else if (userInput == 'O' || userInput == 'o') {
            compInput = 'X';
            System.out.println("Player option is O");
            System.out.println("Computer option is X");
        } else
            System.out.println("Select in between o or x");
    }
    public void uc3_showBoard() {
        System.out.println(" board: ");
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[4]+" | "+board[6]);
        System.out.println("----------");
        System.out.println(board[7]+" | "+board[9]+" | "+board[9]);
    }

    public static void main(String[] args) {
        TicTacToe runner = new TicTacToe();
        runner.welcome();
        runner.uc1_CreateBoard();
        runner.uc2_choosLetter();
        runner.uc3_showBoard();
    }
}
