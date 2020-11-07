package com.github.code.retreat;

public class GameOfLife {

    public int countNeighbors(CellState[][] board) {
        int count = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                CellState cellState = board[i][j];
                if(cellState.equals(CellState.LIFE)){
                    count++;
                }
            }
        }
        return count-1;
    }
}
