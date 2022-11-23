package edu.bht.ccdttt.application;

import edu.bht.ccdttt.data.GameBoard;

import java.util.Arrays;
import java.util.HashSet;

public class TTTMain {
    public static void main(String[] args) {

        System.out.println("CCD-TicTacToe for the masses!");
        GameBoard testBoard = new GameBoard();
        // Print possible full rows
        System.out.println(Arrays.toString(GameBoard.POSSIBLE_FULL_ROWS));
        HashSet<Integer> testSet = (HashSet<Integer>) GameBoard.newHashSet(1,2,3,4,5,6,7,8,9);
        for (HashSet<Integer> fullRow : GameBoard.POSSIBLE_FULL_ROWS) {
            System.out.println(testSet.containsAll(fullRow));
        }

        // Test user input
        System.out.println("Test: " + InputValidator.getPlayerInput("Player X"));
    }
}