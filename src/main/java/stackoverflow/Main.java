package main.java.stackoverflow;

public class Main {
    public static void main(String[] args) {
        int result = Factorial.factorial(-1);
        System.out.println(result);
    }

    public static class Factorial {
        static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

}