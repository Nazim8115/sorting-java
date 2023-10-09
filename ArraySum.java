public class ArraySum {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int num1 = 0;
        int num2 = 0;
        int k = 1;
        for (int i = arr1.length - 1; i >= 0; i--) {
            num1 = num1 + arr1[i] * k;
            k = k * 10;
        }
        k = 1;
        for (int i = arr2.length - 1; i >= 0; i--) {
            num2 = num2 + arr2[i] * k;
            k = k * 10;
        }
        int num3 = num1 + num2;
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = num3 % 10;
            num3 = num3 / 10;
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 2, 1, 6, 5 };
        int arr2[] = { 7, 38, 2, 1, 3 };

    }
}
