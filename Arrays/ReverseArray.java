package Arrays;
public class ReverseArray {
    public static void reversArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            // swap two values with arithmetic operation
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 11, 5, 1000, 10, 7, 8 };
        reversArray(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
