package src.sortingalgorithms;

import java.util.Arrays;
import src.CustomObject;

public class RadixSort {

    // Radix Sort for integers
    public static void radixSort(int[] array) {
        int max = getMax(array);
        int min = getMin(array);
        int range = max - min + 1; // to handle negative numbers

        for (int exp = 1; (max - min) / exp > 0; exp *= 10) {
            countingSort(array, exp, min, range);
        }
    }

    // Radix Sort for strings
    public static void radixSort(String[] array) {
        int maxLen = getMaxStringLength(array);
        for (int position = maxLen - 1; position >= 0; position--) {
            countingSortByCharacter(array, position);
        }
    }

    // Radix Sort for CustomObjects based on the 'key'
    public static void radixSort(CustomObject[] array) {
        int maxKey = getMaxKey(array);
        for (int exp = 1; maxKey / exp > 0; exp *= 10) {
            countingSortByCustomObjectKey(array, exp);
        }
    }

    private static void countingSort(int[] array, int exp, int min, int range) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[range];

        Arrays.fill(count, 0);
        for (int i = 0; i < n; i++) {
            int index = ((array[i] - min) / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = ((array[i] - min) / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    private static void countingSortByCharacter(String[] array, int position) {
        int n = array.length;
        String[] output = new String[n];
        int[] count = new int[256]; 

        Arrays.fill(count, 0);
        for (String s : array) {
            char ch = position < s.length() ? s.charAt(position) : 0;
            count[ch]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            char ch = position < array[i].length() ? array[i].charAt(position) : 0;
            output[count[ch] - 1] = array[i];
            count[ch]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    private static void countingSortByCustomObjectKey(CustomObject[] array, int exp) {
        int n = array.length;
        CustomObject[] output = new CustomObject[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);
        for (CustomObject obj : array) {
            int index = (obj.getKey() / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (array[i].getKey() / exp) % 10;
            output[count[index] - 1] = array[i];
            count[index]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    private static int getMax(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    private static int getMin(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    private static int getMaxStringLength(String[] array) {
        return Arrays.stream(array).mapToInt(String::length).max().getAsInt();
    }

    private static int getMaxKey(CustomObject[] array) {
        return Arrays.stream(array).mapToInt(CustomObject::getKey).max().getAsInt();
    }
}
