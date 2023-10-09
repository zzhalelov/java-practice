package arrays.Task7;

//Вывести количество положительных и отрицательных элементов
// (Необходимо определить количество положительных и отрицательных элементов в массиве и вывести его).
// В реализации задачи понадобится определить 2 переменные для хранения количества элементов:
// Одна переменная для хранения количества положительных элементов, допустим positiveCount.
// Вторая для хранения количества отрицательных элементов, допустим negativeCount. Названия переменных можно выбирать на своё усмотрение.
//Output the number of positive and negative elements (It is necessary to determine the number of positive and negative elements in the array and output it)
public class Main {
    public static void main(String[] args) {
        int[] array = {7, -3, 9, -11, 18, 99, 2, 11};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int j : array) {
            if (j > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
    }
}