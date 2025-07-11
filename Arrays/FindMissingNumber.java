package Arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        Integer result = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                result = arr[i] - 1;
            }
        }
        System.out.println("The result is : " + result);
        return result;
    }

    public static int findMissingNumberEff(int[] arr) {
        int n = arr.length + 1; 
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr)
            actualSum += num;
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        findMissingNumber(new int[] { 2, 4, 1, 8, 6, 3, 7 });
        System.out.println(findMissingNumberEff(new int[] { 2, 4, 1, 8, 6, 3, 7 }));
    }
}
