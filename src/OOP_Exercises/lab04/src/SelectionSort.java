package OOP_Exercises.lab04.src;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        printArray(array);
        System.out.println();
        System.out.print("Sort array: ");
        selectionSort(array);
    }
}
