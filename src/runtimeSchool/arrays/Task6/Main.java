package runtimeSchool.arrays.Task6;

//Вывести только чётные элементы массива по порядку (каждый второй элемент)
//output only even array elements in order (every second element)
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}