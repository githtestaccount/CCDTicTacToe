package edu.bht.ccdttt.data;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameBoardTest {

    @Test
    public void testGameBoard() {

        GameBoard gameBoard = new GameBoard();

        //Test size of cell map
        assertThat(gameBoard.gameBoardCells.size(), is(9));

        //Test empty values of new cell map
        assertThat(gameBoard.gameBoardCells, IsMapContaining.hasEntry(1, GameBoard.CELL.EMPTY));
        assertThat(gameBoard.gameBoardCells, IsMapContaining.hasEntry(9, GameBoard.CELL.EMPTY));

    }
}
