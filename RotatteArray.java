public class RotatteArray {
    public static void rotate(int[] arr, int d) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        int k = 0;
        for (int i = d; i < temp.length; i++) {
            arr[k] = temp[i];
            k++;
        }
        for (int j = 0; j < d; j++) {
            arr[k] = temp[j];
            k++;
        }

    }

    public static void main(String[] args) {

    }
}
