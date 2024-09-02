package src;

import java.util.Random;

public class DataGenerator {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static int[] generateIntData(int sizeInKB) {
        int numberOfIntegers = (sizeInKB * 1024) / Integer.BYTES;
        Random random = new Random();
        int[] data = new int[numberOfIntegers];
        for (int i = 0; i < numberOfIntegers; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static String[] generateStringData(int sizeInKB) {
        int numberOfStrings = (sizeInKB * 1024) / 10; 
        Random random = new Random();
        String[] data = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            data[i] = generateRandomString(random, 10);
        }
        return data;
    }

    public static CustomObject[] generateCustomObjectData(int sizeInKB) {
        int numberOfObjects = (sizeInKB * 1024) / 32; 
        Random random = new Random();
        CustomObject[] data = new CustomObject[numberOfObjects];
        for (int i = 0; i < numberOfObjects; i++) {
            data[i] = new CustomObject(
                    generateRandomString(random, 5), 
                    random.nextInt(100),             
                    random.nextDouble() * 100       
            );
        }
        return data;
    }

    private static String generateRandomString(Random random, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}
