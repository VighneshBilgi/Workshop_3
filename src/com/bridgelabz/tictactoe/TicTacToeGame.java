package com.bridgelabz.tictactoe;

import java.util.Scanner;

class TicTacToeGame {

    static Scanner sc = new Scanner(System.in);
    char[] board = new char[10];
    char playerLetter, computerLetter;

    TicTacToeGame(){
        for(int i = 1; i<board.length; i++){

            board[i] = ' ';
        }

    }

    public void chooseLetter(){
        System.out.println("Choose X or O:");
        char c = sc.next().charAt(0);

        if(c == 'x'||c == 'X'||c == 'o'||c == 'O'){

            if(c == 'x'||c == 'X'){
                playerLetter = 'X';
                System.out.println("You chose "+playerLetter);
                computerLetter = 'O';
                System.out.println("Computer is "+computerLetter);
            }
            else{
                playerLetter = 'O';
                System.out.println("You chose "+playerLetter);
                computerLetter = 'X';
                System.out.println("Computer is "+computerLetter);
            }
        }
        else{
            System.out.println("Error ! Entered incorrect character!");
        }

    }

    public char[] displayBoard(){
        return  board;
    }

}
