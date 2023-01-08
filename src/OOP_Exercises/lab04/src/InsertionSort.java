package OOP_Exercises.lab04.src;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        insertionSort(array);
        printArray(array);
    }
}
