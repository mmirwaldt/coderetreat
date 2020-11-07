package com.github.code.retreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {
    GameOfLife gameOfLife = new GameOfLife();

    @Test
    void testCellHasNoNeighbors(){
        CellState[][] board = new CellState[][]{
                {CellState.DEAD,CellState.DEAD,CellState.DEAD},
                {CellState.DEAD,CellState.LIFE,CellState.DEAD},
                {CellState.DEAD,CellState.DEAD,CellState.DEAD}
        };
        assertEquals(0,gameOfLife.countNeighbors(board));
    }

    @Test
    void testCellHasOneNeighbor(){
        CellState[][] board = new CellState[][]{
                {CellState.LIFE,CellState.DEAD,CellState.DEAD},
                {CellState.DEAD,CellState.LIFE,CellState.DEAD},
                {CellState.DEAD,CellState.DEAD,CellState.DEAD}
        };
        assertEquals(1,gameOfLife.countNeighbors(board));
    }


    @Test
    void testCellHasEightNeighbor(){
        CellState[][] board = new CellState[][]{
                {CellState.LIFE,CellState.LIFE,CellState.LIFE},
                {CellState.LIFE,CellState.LIFE,CellState.LIFE},
                {CellState.LIFE,CellState.LIFE,CellState.LIFE}
        };
        assertEquals(8,gameOfLife.countNeighbors(board));
    }

}
