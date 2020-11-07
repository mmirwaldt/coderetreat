package com.github.code.retreat;

public class GameOfLife {
    public boolean willSurvive(int lifeNeighbors) {
        return lifeNeighbors == 3;
    }
}
