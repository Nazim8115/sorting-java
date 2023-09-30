
import java.util.Arrays;

public class mergeTwoSortedArray {

    public static int[] merge(int arr1[], int[] arr2) {
        int result[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;

    }

    public static void main(String[] args) {

        int a[] = { 1, 4, 6, 10, 13 };
        int b[] = { 2, 5, 7, 9 };
        int c[] = merge(a, b);
        System.out.println(Arrays.toString(c));

    }
}
