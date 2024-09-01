package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import src.sortingalgorithms.*;

public class SortingAlgorithmTest {

    @Test
    public void testQuickSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        QuickSort.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        MergeSort.mergeSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        HeapSort.heapSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        InsertionSort.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        SelectionSort.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testRadixSortInt() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        RadixSort.radixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testRadixSortString() {
        String[] input = {"apple", "orange", "banana", "grape", "peach"};
        String[] expected = {"banana", "grape", "apple", "peach", "orange"};

        RadixSort.radixSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testRadixSortCustomObject() {
        src.CustomObject[] input = {
            new src.CustomObject("A", 2, 1.0),
            new src.CustomObject("B", 1, 2.0),
            new src.CustomObject("C", 3, 3.0)
        };
        src.CustomObject[] expected = {
            new src.CustomObject("B", 1, 2.0),
            new src.CustomObject("A", 2, 1.0),
            new src.CustomObject("C", 3, 3.0)
        };
        RadixSort.radixSort(input);
        assertArrayEquals(expected, input);
    }
}
