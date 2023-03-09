package com.bridgelabz.tictactoe;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    char userInput = ' ';
    char compInput = ' ';
    int playerToss;


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
    public void uc4_makeAMove() {
        System.out.println("Enter the position number between 1 to 9 ");
        int move = sc.nextInt();
        board[move] = userInput;
        uc3_showBoard();
        uc8_computerTurn();
    }
    public void uc5_checkFreeSpace() {
        System.out.println("Free positions are = ");
        for(int i = 1; i < board.length; i++) {
            if(board[i] == ' ')
                System.out.print(i+" ");
        }

    }
    public void uc6_toss() {

        int toss = rnd.nextInt(2);
        System.out.println("Enter 1 for head and 0 for tail in order to check who plays first");
        playerToss = sc.nextInt();
        if(toss == playerToss && toss == 1) {
            System.out.println("Heads ,  player won the toss");
            uc4_makeAMove();

        }
        else if(toss == playerToss && toss == 0) {
            System.out.println("Tails, player won the toss");
            uc4_makeAMove();

        }else {
            System.out.println("Computer will play first");
            uc8_computerTurn();
        }
    }
    public void uc7_turn() {

        if ((board[1] == compInput && board[2] == compInput && board[3] == compInput) ||
                (board[1] == compInput && board[4] == compInput && board[7] == compInput) ||
                (board[1] == compInput && board[5] == compInput && board[9] == compInput) ||
                (board[2] == compInput && board[5] == compInput && board[8] == compInput) ||
                (board[3] == compInput && board[6] == compInput && board[9] == compInput) ||
                (board[3] == compInput && board[5] == compInput && board[7] == compInput) ||
                (board[4] == compInput && board[5] == compInput && board[6] == compInput) ||
                (board[7] == compInput && board[8] == compInput && board[9] == compInput)) {
            System.out.println("Computer win!");

        } else if ((board[1] == userInput && board[2] == userInput && board[3] == userInput) ||
                (board[1] == userInput && board[4] == userInput && board[7] == userInput) ||
                (board[1] == userInput && board[5] == userInput && board[9] == userInput) ||
                (board[2] == userInput && board[5] == userInput && board[8] == userInput) ||
                (board[3] == userInput && board[6] == userInput && board[9] == userInput) ||
                (board[3] == userInput && board[5] == userInput && board[7] == userInput) ||
                (board[4] == userInput && board[5] == userInput && board[6] == userInput) ||
                (board[7] == userInput && board[8] == userInput && board[9] == userInput)) {
            System.out.println("Player win!");

        } else {
            System.out.println("Game tie");
        }

    }
    public  void uc8_computerTurn() {

        int computerMove;
        Random random = new Random();
        computerMove = random.nextInt(9) + 1;

        System.out.println("Computer choose:: " + computerMove);
        if (board[computerMove] == ' ') {
            board[computerMove] =  compInput;
            uc3_showBoard();

        }
    }

    public static void main(String[] args) {
        TicTacToe runner = new TicTacToe();
        runner.welcome();
        runner.uc1_CreateBoard();
        runner.uc2_choosLetter();
        runner.uc3_showBoard();
        runner.uc4_makeAMove();
        runner.uc5_checkFreeSpace();
        runner.uc6_toss();
        runner.uc7_turn();
        runner.uc8_computerTurn();
    }
}
