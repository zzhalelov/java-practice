package runtimeSchool.arrays.Task1;
//Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for)
//Output the first 3 elements of the array (Output the first 3 elements of the array using the for loop)
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}