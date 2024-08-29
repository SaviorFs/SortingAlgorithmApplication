package src;

import src.sortingalgorithms.*; // Import sorting algorithms from the sortingalgorithms package
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmApplication {

    public static void main(String[] args) {
        // Test with Integer data
        int[] intData = {64, 34, 25, 12, 22, 11, 90};
        runIntSorts(intData);

        // Test with String data
        String[] stringData = {"apple", "orange", "banana", "grape", "peach"};
        runStringSorts(stringData);

        // Test with Object data
        CustomObject[] objectData = createRandomObjects(10);
        runObjectSorts(objectData);
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

        // RadixSort does not work with String[] directly in this setup
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

        // RadixSort does not work with CustomObject[] directly in this setup
    }

    private static CustomObject[] createRandomObjects(int size) {
        Random random = new Random();
        CustomObject[] objects = new CustomObject[size];
        for (int i = 0; i < size; i++) {
            objects[i] = new CustomObject(
                "Name" + i,
                random.nextInt(100),
                random.nextDouble() * 100
            );
        }
        return objects;
    }
}
