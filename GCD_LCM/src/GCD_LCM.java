import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, gcd, lcm;

        System.out.print("Please enter first number: ");
        n1 = scan.nextInt();

        System.out.print("Please enter second number: ");
        n2 = scan.nextInt();

        gcd = 1;
        if (n1<n2) {
            for(int i=n1; i>=1; i--) {
                if(n1%i==0 && n2%i==0) {
                    gcd = i; // greatest common divisor
                    break;
                }
            }
        }else if (n2<n1) {
            for(int i=n2; i>=1; i--) {
                if(n2%i==0 && n1%i==0) {
                    gcd = i; // greatest common divisor
                    break;
                }
            }
        }
        System.out.println("Greatest common divisor(GCD): " + gcd);

        lcm = 1;
        for (int k=1; k<=(n1*n2); k++) {
            if(k%n1==0 && k%n2==0) {
                lcm = k; // least common multiple
                break;
            }
        }
        System.out.println("Least common multiple(LCM): " + lcm);
    }
}
