package arrays.Task13;

import java.util.Arrays;
//Сортировка выбором: Реализуйте сортировку выбором для массива
public class Main {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 4, 1, 8, 5, 2, 9, 6, 3};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}