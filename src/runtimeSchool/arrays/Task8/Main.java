package runtimeSchool.arrays.Task8;

//Вывести элементы массива которые больше предыдущего (Необходимо вывести все элементы массива которые больше чем впереди стоящий)
//Output array elements that are larger than the previous one (It is necessary to output all array elements that are larger than the one in front)
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.println(array[i] + ", ");
            }
        }
    }
}