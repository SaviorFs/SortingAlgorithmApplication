package src;

import src.sortingalgorithms.*;
import java.util.Arrays;

public class SortingAlgorithmApplication {

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        runIntSorts(data);
    }

    public static void runIntSorts(int[] data) {
        int[] quickSorted = data.clone();
        QuickSort.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(quickSorted));

        int[] mergeSorted = data.clone();
        MergeSort.mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("MergeSort: " + Arrays.toString(mergeSorted));

        int[] heapSorted = data.clone();
        HeapSort.heapSort(heapSorted);
        System.out.println("HeapSort: " + Arrays.toString(heapSorted));

        int[] bubbleSorted = data.clone();
        BubbleSort.bubbleSort(bubbleSorted);
        System.out.println("BubbleSort: " + Arrays.toString(bubbleSorted));

        int[] insertionSorted = data.clone();
        InsertionSort.insertionSort(insertionSorted);
        System.out.println("InsertionSort: " + Arrays.toString(insertionSorted));

        int[] selectionSorted = data.clone();
        SelectionSort.selectionSort(selectionSorted);
        System.out.println("SelectionSort: " + Arrays.toString(selectionSorted));

        int[] radixSorted = data.clone();
        RadixSort.radixSort(radixSorted);
        System.out.println("RadixSort: " + Arrays.toString(radixSorted));
    }
}
