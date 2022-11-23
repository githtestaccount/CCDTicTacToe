package edu.bht.ccdttt.application;

import java.util.InputMismatchException;
import java.util.Scanner;
import edu.bht.ccdttt.data.GameBoard;

class InputValidator {

    GameBoard currentGameBoard;
    GameBoard.PLAYER_SYMBOL currentPlayer;

    int getPlayerInput() {
        int nextMove;

        while(true) {
            try {
                System.out.print("\nPlayer " + currentPlayer.label + " is on the move: ");
                Scanner scanner = new Scanner(System.in);
                nextMove = scanner.nextInt();

                if (nextMove < 1 || nextMove > 9) {
                    System.out.print("\nOny numbers 1 to 9, please! ");
                    continue;
                }

                if (currentGameBoard.gameBoardCells.get(nextMove) != GameBoard.CELL.EMPTY) {
                    System.out.print("\nChoose a free square, please! ");
                    continue;
                }
                break;
            } catch(InputMismatchException | NumberFormatException ex ) {
                System.out.print("\nOny numbers 1 to 9, please! ");
            } catch(Exception e ) {
                System.out.println("\n\nException caught :: " + e);
            }
        }
        return nextMove;
    }

    public InputValidator(GameBoard currentGameBoard, GameBoard.PLAYER_SYMBOL currentPlayer) {
        this.currentGameBoard = currentGameBoard;
        this.currentPlayer = currentPlayer;
    }
}
