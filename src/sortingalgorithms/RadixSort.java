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

    // RadixSort for String arrays (sorting by length)
    public static void radixSort(String[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    // RadixSort for CustomObject arrays (based on key)
    public static void radixSort(CustomObject[] array) {
        int max = getMax(array);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int getMax(String[] array) {
        String maxStr = array[0];
        for (String str : array) {
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }
        }
        return maxStr.length();
    }

    private static int getMax(CustomObject[] array) {
        int max = array[0].getKey();
        for (CustomObject obj : array) {
            if (obj.getKey() > max) {
                max = obj.getKey();
            }
        }
        return max;
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

    private static void countingSort(String[] array, int exp) {
        int n = array.length;
        String[] output = new String[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (String str : array) {
            int index = (str.length() / exp) % 10;
            count[index]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            String str = array[i];
            int index = (str.length() / exp) % 10;
            output[count[index] - 1] = str;
            count[index]--;
        }

        System.arraycopy(output, 0, array, 0, n);
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
