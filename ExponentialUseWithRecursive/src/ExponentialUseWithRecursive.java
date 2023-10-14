import java.util.Scanner;
public class ExponentialUseWithRecursive {
    static int exponential() {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.print("Please enter base: ");
        int base = scan.nextInt();
        System.out.print("Please enter exponent: ");
        int exponent = scan.nextInt();
        if (base != 0) {
            for(int i=1; i<=exponent; i++) {
                result *= base;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("indefinite number!!!");
        }
        return exponential();
    }
    public static void main(String[] args) {
        exponential();
    }
}
