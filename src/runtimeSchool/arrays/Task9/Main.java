package runtimeSchool.arrays.Task9;

//Найти максимальный и минимальный элементы массива (Необходимо определить максимальный и минимальный элементы в массиве и вывести их)
//Find the maximum and minimum elements of the array (It is necessary to determine the maximum and minimum elements in the array and output them)
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}