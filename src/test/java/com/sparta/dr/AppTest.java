package com.sparta.dr;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AppTest {
    @Test
    @DisplayName("Given the bubble sorter is given a dataset return sorted array")
    void givenTheBubbleSorterIsGivenADatasetReturnSortedArray() {
        int[] data = {5, 22, 1, 11, 424, 20};
        String expected = "{1, 5, 11, 20, 22, 424}";
        String answer = Arrays.toString(BubbleSorter.arraySort(data));

    }

    @Test
    @DisplayName("given the bubble sorter is given a data set with negative values return sorted array")
    void givenTheBubbleSorterIsGivenADataSetWithNegativeValuesReturnSortedArray() {
        int[] data = {11, 22, 1, -5, 424, 20};
        String expected = "{-5, 1, 11, 20, 22, 424}";
        String answer = Arrays.toString(BubbleSorter.arraySort(data));

    }

}
