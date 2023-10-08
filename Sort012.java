import java.util.Arrays;

/**
 * Sort012
 */
public class Sort012 {
    public static void sort012(int arr[], int n) {
        int nextZero = 0;
        int nextTwo = n - 1;
        int i = 0;
        while (i <= nextTwo) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                nextZero++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;
                nextTwo--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2, 1, 2 };
        int n = arr.length;
        sort012(arr, n);
        System.out.println(Arrays.toString(arr));

    }

}