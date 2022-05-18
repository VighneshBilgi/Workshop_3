package com.bridgelabz.tictactoe;

public class TicTacToeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game!");

        TicTacToeGame tttg = new TicTacToeGame();
        System.out.println(tttg.displayBoard());
    }
}
