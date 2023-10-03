import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, a, b = 1, c = 0;

        System.out.print("How many numbers will I write from the Fibonacci series? ");
        n = scan.nextInt();

        System.out.print("Fibonacci Series: " + c + ",");
        for (int i = 1; i <= (n-1); i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + ",");
        }
    }
}
