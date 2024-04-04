package runtimeSchool.exceptions.Task6;

//Create an array and try to access an element with an index that is outside the array. Handle the "ArrayIndexOutOfBoundsException exception"
//Создайте массив и попытайтесь получить доступ к элементу с индексом, который находится за пределами массива. Обработайте исключение "ArrayIndexOutOfBoundsException"
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            int index = 2; //index out of bounds
            int value = array[index];
            System.out.println("Element's value: " + value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("INDEX IS OUTSIDE THE ARRAY");
        }
    }
}