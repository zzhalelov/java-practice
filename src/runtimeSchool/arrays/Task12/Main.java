package runtimeSchool.arrays.Task12;

public class Main {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];
        // Копируем элементы из первого массива в новый массив
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }
        // Копируем элементы из второго массива в новый массив
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Merged array: ");
        for (int element : mergedArray) {
            System.out.println(element + " ");
        }
    }
}