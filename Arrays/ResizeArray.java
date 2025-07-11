package Arrays;

public class ResizeArray {
    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(arr.length);
        arr = resize(arr, 6);
        System.out.println(arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
