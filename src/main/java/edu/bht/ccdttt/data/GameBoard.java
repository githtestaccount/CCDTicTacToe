package edu.bht.ccdttt.data;

import java.util.HashMap;
import java.util.HashSet;

public class GameBoard {
    static final int gameBoardSize = 9;
    public enum CELL {
        X("X"),
        O("O"),
        EMPTY(" ");

        public final String label;
        CELL(String label) {
            this.label = label;
        }
    }

    public HashMap<Integer, CELL> gameBoardCells = new HashMap<>(9, 1.0F);

    public GameBoard() {
        for (int i = 1; i <= gameBoardSize; i++) {
            this.gameBoardCells.put(i, CELL.EMPTY);
        }

    }
}
