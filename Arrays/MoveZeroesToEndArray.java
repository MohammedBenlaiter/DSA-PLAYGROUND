package Arrays;

public class MoveZeroesToEndArray {
    public static void moveZeroesToEnd(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0) {
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            }
        }
    }

    // this is more efficient 
    public static void moveZeroToEndEff(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 4, 12 };
        moveZeroToEndEff(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
