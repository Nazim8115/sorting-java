public class FindMinIndex {
    public static int findMin(int arr[]) {
        if (arr.length <= 0) {
            return 0;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 40, 50, 30, 32, 10, 20 };
        int result = findMin(arr);
        System.out.println(result);

    }
}
