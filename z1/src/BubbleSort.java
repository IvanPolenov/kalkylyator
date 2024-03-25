import java.util.Arrays;
import java.util.Random;
public class BubbleSort {
    public static void main (String[] args) {
        int[] array = generateRandomArray(9, 100, 7000);
        System.out.println(STR."Исходный массив:\{Arrays.toString(array)}");
        bubbleSort(array);
        System.out.println(STR."Отсортированный массив:\{Arrays.toString(array)}");
    }public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }
}