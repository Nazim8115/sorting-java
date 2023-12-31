import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap......
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        bubbleSort(data);

        System.out.println(Arrays.toString(data));

    }
}
