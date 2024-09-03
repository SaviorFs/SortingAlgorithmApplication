package src.sortingalgorithms;

import src.CustomObject;

public class HeapSort {

    public static void heapSort(int[] array) {
        int n = array.length;

        // Build the heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i); // Move current root to end
            heapify(array, i, 0); // call max heapify on the reduced heap
        }
    }

    public static void heapSort(String[] array) {
        int n = array.length;

        // Build the heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i); // Move current root to end
            heapify(array, i, 0); // call max heapify on the reduced heap
        }
    }

    public static void heapSort(CustomObject[] array) {
        int n = array.length;

        // Build the heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i); // Move current root to end
            heapify(array, i, 0); // call max heapify on the reduced heap
        }
    }

    // Heapify for integer array
    private static void heapify(int[] array, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    // Heapify for string array
    private static void heapify(String[] array, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }

        if (right < n && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    // Heapify for CustomObject array
    private static void heapify(CustomObject[] array, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }

        if (right < n && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, n, largest);
        }
    }

    // Swap function for integer array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Swap function for string array
    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Swap function for CustomObject array
    private static void swap(CustomObject[] array, int i, int j) {
        CustomObject temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
