package src.sortingalgorithms;

import src.CustomObject;
import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    // RadixSort sorting by characters from the last to the first
    public static void radixSort(String[] array) {
        int maxLength = getMaxStringLength(array);

        // Sort strings starting from the last character to the first
        for (int position = maxLength - 1; position >= 0; position--) {
            countingSortByCharacter(array, position);
        }
    }

    // RadixSort for CustomObject arrays (based on key)
    public static void radixSort(CustomObject[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    // Get the maximum value in an int array
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Get the maximum key in a CustomObject array
    private static int getMax(CustomObject[] array) {
        int max = array[0].getKey();
        for (CustomObject obj : array) {
            if (obj.getKey() > max) {
                max = obj.getKey();
            }
        }
        return max;
    }

    // Get the maximum string length in a String array
    private static int getMaxStringLength(String[] array) {
        int maxLength = 0;
        for (String str : array) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    private static void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    // Counting sort based on specific character position in the string
    private static void countingSortByCharacter(String[] array, int position) {
        int n = array.length;
        String[] output = new String[n];
        int[] count = new int[256]; 
        Arrays.fill(count, 0);

        for (String str : array) {
            int charValue = charAt(str, position);
            count[charValue]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int charValue = charAt(array[i], position);
            output[count[charValue] - 1] = array[i];
            count[charValue]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    // gets the character value at a specific position in a string
    private static int charAt(String s, int position) {
        if (position < s.length()) {
            return s.charAt(position);
        } else {
            return 0; 
        }
    }

    private static void countingSort(CustomObject[] array, int exp) {
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
            CustomObject obj = array[i];
            int index = (obj.getKey() / exp) % 10;
            output[count[index] - 1] = obj;
            count[index]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }
}
