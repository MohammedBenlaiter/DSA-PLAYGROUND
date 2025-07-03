public class TimeComplexity {
    public int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public int findSum2(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.findSum(99999));
        System.out.println("The time taken - " + (System.currentTimeMillis() - now) + " millisecs.");
    }
}