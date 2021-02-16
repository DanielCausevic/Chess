package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Piece board[][] = new Piece[8][8];
        King king = new King();
        Queen queen = new Queen();
        Bishop bishop = new Bishop();
        Knight knight = new Knight();
        Tower tower = new Tower();
        Pawn pawn = new Pawn();
        int[] lengthOfArray = {2, 2, 4, 4, 4, 16};
        Piece[] thePiece = {king, queen, bishop, knight, tower, pawn};
        for(int n = 0; n < lengthOfArray.length; n++) {
            for (int i = 0; i < lengthOfArray[n]; i++) {
                boolean continueIt = true;
                do {

                    int upTo81 = rand.nextInt(8);
                    int upTo82 = rand.nextInt(8);
                    if(board[upTo81][upTo82] == null) {
                        board[upTo81][upTo82] = thePiece[n];
                        continueIt = false;
                    }
                }while(continueIt == true);
            }
        }
        for (int row=0; row<board.length; row++) {
            System.out.println("\n");
            for (int col=0; col<board[row].length; col++) {
                System.out.print("  " + board[row][col]);
            }
        }
    }
}
