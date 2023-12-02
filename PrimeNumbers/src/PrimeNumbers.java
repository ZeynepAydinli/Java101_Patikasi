import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean isPrime = true;

        System.out.print("Please enter number: ");
        num = scan.nextInt();

        for(int i = 2; i < num; i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }else {
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime number" );
        }else {
            System.out.println(num + " is not prime number!!!");
        }
    }
}
