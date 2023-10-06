public class SecondLargest {

    public static int secondLargestElement(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }

        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 40, 50, 60 };
        int x = secondLargestElement(arr);
        System.out.println(x);
    }
}
