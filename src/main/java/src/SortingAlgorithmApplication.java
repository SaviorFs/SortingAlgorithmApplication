package src;

import java.util.Arrays;
import src.sortingalgorithms.*;

public class SortingAlgorithmApplication {

    public static void main(String[] args) {
        // Testing with various data sizes
        int[] dataSizes = {1, 10, 100, 1024, 10240, 102400}; // in KB (1KB to 100MB)
        
        for (int size : dataSizes) {
            System.out.println("Testing with data size: " + size + "KB");
            
            // Integer data
            int[] intData = DataGenerator.generateIntData(size);
            runIntSorts(intData);
            
            // String data
            String[] stringData = DataGenerator.generateStringData(size);
            runStringSorts(stringData);
            
            // CustomObject data
            CustomObject[] objectData = DataGenerator.generateCustomObjectData(size);
            runObjectSorts(objectData);
        }
    }

    public static void runIntSorts(int[] data) {
        System.out.println("Running integer sorts...");

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

    public static void runStringSorts(String[] data) {
        System.out.println("Running string sorts...");

        String[] quickSorted = data.clone();
        QuickSort.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(quickSorted));

        String[] mergeSorted = data.clone();
        MergeSort.mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("MergeSort: " + Arrays.toString(mergeSorted));

        String[] heapSorted = data.clone();
        HeapSort.heapSort(heapSorted);
        System.out.println("HeapSort: " + Arrays.toString(heapSorted));

        String[] bubbleSorted = data.clone();
        BubbleSort.bubbleSort(bubbleSorted);
        System.out.println("BubbleSort: " + Arrays.toString(bubbleSorted));

        String[] insertionSorted = data.clone();
        InsertionSort.insertionSort(insertionSorted);
        System.out.println("InsertionSort: " + Arrays.toString(insertionSorted));

        String[] selectionSorted = data.clone();
        SelectionSort.selectionSort(selectionSorted);
        System.out.println("SelectionSort: " + Arrays.toString(selectionSorted));

        String[] radixSorted = data.clone();
        RadixSort.radixSort(radixSorted);
        System.out.println("RadixSort: " + Arrays.toString(radixSorted));
    }

    public static void runObjectSorts(CustomObject[] data) {
        System.out.println("Running object sorts...");

        CustomObject[] quickSorted = data.clone();
        QuickSort.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(quickSorted));

        CustomObject[] mergeSorted = data.clone();
        MergeSort.mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("MergeSort: " + Arrays.toString(mergeSorted));

        CustomObject[] heapSorted = data.clone();
        HeapSort.heapSort(heapSorted);
        System.out.println("HeapSort: " + Arrays.toString(heapSorted));

        CustomObject[] bubbleSorted = data.clone();
        BubbleSort.bubbleSort(bubbleSorted);
        System.out.println("BubbleSort: " + Arrays.toString(bubbleSorted));

        CustomObject[] insertionSorted = data.clone();
        InsertionSort.insertionSort(insertionSorted);
        System.out.println("InsertionSort: " + Arrays.toString(insertionSorted));

        CustomObject[] selectionSorted = data.clone();
        SelectionSort.selectionSort(selectionSorted);
        System.out.println("SelectionSort: " + Arrays.toString(selectionSorted));

        CustomObject[] radixSorted = data.clone();
        RadixSort.radixSort(radixSorted);
        System.out.println("RadixSort: " + Arrays.toString(radixSorted));
    }
}
