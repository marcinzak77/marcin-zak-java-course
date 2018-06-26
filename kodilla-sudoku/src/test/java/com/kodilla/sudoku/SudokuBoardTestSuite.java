package com.kodilla.sudoku;

import com.kodilla.sudoku.sudokuBoard.SudokuBoard;
import org.junit.Test;

public class SudokuBoardTestSuite {

    @Test
    public void SudokuBoardTestSuite() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();

        //When
        System.out.println(sudokuBoard);
        //Then
    }
}
