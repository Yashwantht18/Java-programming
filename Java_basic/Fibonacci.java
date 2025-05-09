class Fibonacci {
    public int fibonacciSeries(int n) {
        if (n <= 1)
            return n;
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String args[]) {
        int n = 10;
        Fibonacci obj = new Fibonacci();
        for (int i = 0; i < n; i++) {
            System.out.println(obj.fibonacciSeries(i));
        }
    }
}
