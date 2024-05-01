public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}
