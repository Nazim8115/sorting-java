import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // swaping
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        selectionSort(data);
        System.out.println(Arrays.toString(data));

    }
}

// time complexity : O(n^2) -> space complexity O(1)
