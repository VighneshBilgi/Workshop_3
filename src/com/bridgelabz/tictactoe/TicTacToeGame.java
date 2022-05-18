package com.bridgelabz.tictactoe;

class TicTacToeGame {
    char[] board = new char[10];

    TicTacToeGame(){
        for(int i = 1; i<board.length; i++){

            board[i] = ' ';
        }

    }

    public char[] displayBoard(){
        return  board;
    }


}
