import java.util.Arrays;

public class pushZerosEnd {
    public static void solution(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 0, 4, 3, 0 };
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
