public class Fibonacci {

    public static int fibonacciS(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciS(n - 1) + fibonacciS(n - 2);
    }
}