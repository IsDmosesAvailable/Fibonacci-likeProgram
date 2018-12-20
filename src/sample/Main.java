package sample;

public class Main{


    public static void main(String[] args) {
        FibonacciLike fib = new FibonacciLike(1, 2, 8);
        // 3 5 8 13 21 34 55 89...
        fib.run();

        FibonacciLike fib2 = new FibonacciLike(3, 4, 8);
        // 3 5 8 13 21 34 55 89...
        fib2.run();

        FibonacciLike fib3 = new FibonacciLike(-2, 6, 8);
        // 3 5 8 13 21 34 55 89...
        fib3.run();
    }
}
