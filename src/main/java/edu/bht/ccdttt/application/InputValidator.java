package edu.bht.ccdttt.application;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputValidator {

    static int getPlayerInput(String player) {
        int nextMove;

        while(true) {
            try {
                System.out.println("Player " + player + " is on the move: ");
                Scanner scanner = new Scanner(System.in);
                nextMove = scanner.nextInt();

                if (nextMove < 1 || nextMove > 9) {
                    System.out.println("Ony numbers 1 to 9, please!");
                    continue;
                }
                break;
            } catch(InputMismatchException | NumberFormatException ex ) {
                System.out.println("Ony numbers 1 to 9, please: ");
            } catch(Exception e ) {
                System.out.println("\n\nException caught :: " + e);
            }
        }


        return nextMove;
    }
}
