package sample;

public class FibonacciLike {
    int start1;
    int start2;
    int amount;
    int newNum;

    FibonacciLike(int a, int b , int c) {
        start1 = a;
        start2 = b;
        amount = c;

    }

    void run() {
        System.out.println(start1);
        System.out.println(start2);

        for (int i = 1; i <= amount; i++) {
            newNum = start1 + start2;
            System.out.println(newNum);
            start1 = start2;
            start2 = newNum;
            newNum = start1 + start2;
        }

    }
}
