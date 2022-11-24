package edu.bht.ccdttt.application;

import edu.bht.ccdttt.data.GameBoard;
import edu.bht.ccdttt.data.GameBoard.PLAYER_SYMBOL;

import java.util.HashSet;

public class GameBoardRules {

    public static boolean checkWinner(GameBoard gameBoard, PLAYER_SYMBOL currentPlayer) {
        for (HashSet<Integer> fullRow : GameBoard.POSSIBLE_FULL_ROWS) {
            if (gameBoard.playerMoves.get(currentPlayer).containsAll(fullRow)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTie(GameBoard gameBoard) {
        return gameBoard.playerMoves.get(PLAYER_SYMBOL.X).size() +
                gameBoard.playerMoves.get(PLAYER_SYMBOL.O).size() == 9;
    }
}
