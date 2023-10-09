package arrays.Task5;

//Вывести последние 3 элемента массива
//Output the last 3 elements of the array
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = array.length - 3; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}