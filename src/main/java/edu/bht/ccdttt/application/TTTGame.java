package edu.bht.ccdttt.application;

import static java.lang.System.*;
import edu.bht.ccdttt.data.GameBoard;
import edu.bht.ccdttt.data.GameBoard.PLAYER_SYMBOL;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class TTTGame {
    public static void main(String[] args) {

        //print instructions banner once
        out.println();
        out.println("Tic Tac Toe console game");
        out.println();
        out.println("Instructions:");
        out.println("Player X and Player Y may use \nthe numpad to make a move");

        //start game
        while(InputValidator.askForNewGame()) {
            //choose randomly which player gets the first move
            PLAYER_SYMBOL[] players;
            players = GameBoard.PLAYER_SYMBOL.values();
            int randomNum = new Random().nextInt(players.length);
            PLAYER_SYMBOL currentPlayer = players[randomNum];

            GameBoard gameBoard = new GameBoard();
            InputValidator input = new InputValidator(gameBoard);
            GameBoardDrawer.drawGameBoardIndices(gameBoard);

            //game loop
            while(true) {
                int nextMove = input.getPlayerNextMove(currentPlayer);
                gameBoard.registerMove(nextMove, currentPlayer);
                GameBoardDrawer.drawGameBoard(gameBoard);
                break;
            }

        }






        GameBoard testBoard = new GameBoard();
        InputValidator input = new InputValidator(testBoard);
        // Print possible full rows
        System.out.println(Arrays.toString(GameBoard.POSSIBLE_FULL_ROWS));
        HashSet<Integer> testSet = (HashSet<Integer>) GameBoard.newHashSet(1,2,3,4,5,6,7,8,9);
        for (HashSet<Integer> fullRow : GameBoard.POSSIBLE_FULL_ROWS) {
            System.out.println(testSet.containsAll(fullRow));
        }

        // Test GameBoardDrawer
        // GameBoardDrawer drawer = new GameBoardDrawer(testBoard);
        GameBoardDrawer.drawGameBoard(testBoard);
        GameBoardDrawer.drawGameBoardIndices(testBoard);

        // Test user input
        testBoard.gameBoardCells.put(4, GameBoard.CELL.X);
        System.out.println("Test: " + input.getPlayerNextMove(PLAYER_SYMBOL.O));
    }
}