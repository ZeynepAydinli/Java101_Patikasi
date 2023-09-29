import java.util.Scanner;
public class ExponentialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k, mult;

        System.out.print("Enter the value of n from the symbol n^k: ");
        n = scan.nextInt();

        System.out.print("Enter the value of k from the symbol n^k: ");
        k = scan.nextInt();

        mult = 1;
        for (int i=1; i<=k; i++) {
            mult *= n;
        }
        System.out.println("Result of exponent: " + mult);
    }
}
