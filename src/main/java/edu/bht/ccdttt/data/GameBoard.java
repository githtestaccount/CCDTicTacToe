package edu.bht.ccdttt.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GameBoard {
    static final int GAME_BOARD_SIZE = 9;

    //three possible states of game board cells
    public enum CELL {
        X("X"),
        O("O"),
        EMPTY(" ");

        public final String label;
        CELL(String label) {
            this.label = label;
        }
    }

    //eight cell combinations are full rows
    public static final HashSet[] POSSIBLE_FULL_ROWS = new HashSet[]{
            (HashSet<Integer>) newHashSet(7,8,9),
            (HashSet<Integer>) newHashSet(4,5,6),
            (HashSet<Integer>) newHashSet(1,2,3),
            (HashSet<Integer>) newHashSet(7,4,1),
            (HashSet<Integer>) newHashSet(8,5,2),
            (HashSet<Integer>) newHashSet(9,6,3),
            (HashSet<Integer>) newHashSet(7,5,3),
            (HashSet<Integer>) newHashSet(9,5,1)
    };

    //nine game board cells for board display
    public HashMap<Integer, CELL> gameBoardCells = new HashMap<>(9, 1.0F);

    //two sets of cells to register the players moves
    public HashMap<String, HashSet<Integer>> playerMoves = new HashMap<>(2, 1.0F);

    public GameBoard() {
        for (int i = 1; i <= GAME_BOARD_SIZE; i++) {
            this.gameBoardCells.put(i, CELL.EMPTY);
        }
    }

    //helper method
    public static final <T> Set<T> newHashSet(T... objs) {
        Set<T> set = new HashSet<T>();
        Collections.addAll(set, objs);
        return set;
    }
}
