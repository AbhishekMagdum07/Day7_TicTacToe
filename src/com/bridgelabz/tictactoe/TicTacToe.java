package com.bridgelabz.tictactoe;

public class TicTacToe {
    static char[] board = new char[10]; //size 10 char[] with empty spaces
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

    public static void main(String[] args) {
        TicTacToe runner = new TicTacToe();
        runner.welcome();
        runner.uc1_CreateBoard();
    }
}
