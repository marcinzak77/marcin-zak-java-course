package com.kodilla.sudoku.sudokuBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private List<Integer> possibleValues = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9));
}
