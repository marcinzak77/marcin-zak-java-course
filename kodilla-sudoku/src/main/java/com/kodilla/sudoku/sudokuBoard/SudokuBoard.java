package com.kodilla.sudoku.sudokuBoard;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    @Override
    public String toString() {
        return "SudokuBoard{" +
                "sudokuBoard=" + sudokuBoard +
                '}';
    }
}
