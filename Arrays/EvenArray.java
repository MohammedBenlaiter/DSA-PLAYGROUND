package Arrays;
public class EvenArray {
    public static void evenArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[count] = arr[i];
                count++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        evenArray(new int[] { 3, 2, 4, 7, 10, 6, 5 });
    }
}
