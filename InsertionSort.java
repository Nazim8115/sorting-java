import java.util.Arrays;

class insertionSort {

    public static void insertion_Sort(int array[]) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        insertion_Sort(data);
        String arr = Arrays.toString(data);
        System.out.println(arr.substring(1, arr.length() - 1));
    }
}