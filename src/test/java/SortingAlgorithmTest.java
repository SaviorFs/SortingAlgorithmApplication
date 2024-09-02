import org.junit.jupiter.api.Test;
import src.CustomObject;
import src.sortingalgorithms.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmTest {

    private static final int NUM_RUNS = 10; 

    @Test
    public void testQuickSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            QuickSort.quickSort(dataCopy, 0, dataCopy.length - 1);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("QuickSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testMergeSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            MergeSort.mergeSort(dataCopy, 0, dataCopy.length - 1);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("MergeSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testHeapSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            HeapSort.heapSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("HeapSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testBubbleSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            BubbleSort.bubbleSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("BubbleSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testInsertionSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            InsertionSort.insertionSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("InsertionSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testSelectionSort() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            SelectionSort.selectionSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("SelectionSort average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testRadixSortInt() {
        int[] input = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            int[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            RadixSort.radixSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("RadixSort (int) average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testRadixSortString() {
        String[] input = {"apple", "orange", "banana", "grape", "peach"};
        String[] expected = {"apple", "banana", "grape", "orange", "peach"};
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            String[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            RadixSort.radixSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("RadixSort (string) average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }

    @Test
    public void testRadixSortCustomObject() {
        CustomObject[] input = {
            new CustomObject("C", 3, 3.0),
            new CustomObject("A", 2, 1.0),
            new CustomObject("B", 1, 2.0)
        };
        CustomObject[] expected = {
            new CustomObject("B", 1, 2.0),
            new CustomObject("A", 2, 1.0),
            new CustomObject("C", 3, 3.0)
        };
        long totalTime = 0;

        for (int i = 0; i < NUM_RUNS; i++) {
            CustomObject[] dataCopy = input.clone();
            long startTime = System.nanoTime();
            RadixSort.radixSort(dataCopy);
            totalTime += System.nanoTime() - startTime;
            assertArrayEquals(expected, dataCopy);
        }

        System.out.println("RadixSort (CustomObject) average time: " + (totalTime / NUM_RUNS) + " nanoseconds");
    }
}
