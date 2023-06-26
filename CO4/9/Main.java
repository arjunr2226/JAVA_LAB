package 9;

import java.util.Arrays;

class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 8, 2, 1, 4};
        System.out.println("Before sorting: " + Arrays.toString(numbers));

        BubbleSort.bubbleSort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}

