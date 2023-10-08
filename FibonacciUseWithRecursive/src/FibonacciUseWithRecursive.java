import java.util.Scanner;
public class FibonacciUseWithRecursive {
    static  int fibonacci (int n) {
        int result;
       if (n == 1 || n == 2) {
           return 1;
       }
       result = fibonacci(n-1) + fibonacci(n-2);
       return result;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}

