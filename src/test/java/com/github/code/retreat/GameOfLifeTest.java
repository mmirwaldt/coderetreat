package com.github.code.retreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameOfLifeTest {
    GameOfLife gameOfLife = new GameOfLife();

    @Test
    void testWillSurviveWhenThreeNeighborsIsLife() {
        assertTrue(gameOfLife.willSurvive(3));
    }

    @Test
    void testWillSurviveWhenZeroNeighborsIsLife() {
        assertFalse(gameOfLife.willSurvive(0));
    }


    @Test
    void testWillSurviveWhenFiveNeighborsIsLife() {
        assertFalse(gameOfLife.willSurvive(5));
    }

    @Test
    void testWillSurviveWhenTwoNeighborsIsLife() {
        assertFalse(gameOfLife.willSurvive(2));
    }

    @Test
    void testWillSurviveWhenMinusOneNeighborsIsLife() {
        assertThrows(IllegalArgumentException.class,()->gameOfLife.willSurvive(-1));
    }

}
