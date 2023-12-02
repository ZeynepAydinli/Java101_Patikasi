import java.util.Scanner;
public class PrimeNumbers {
    public static void primeNumbers ()
    {
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Please enter number: " );
        int number = scan.nextInt ();

        int counter = 0;
        for (int i = 2; i <= number; i++)
        {
            if ( number % i == 0 )
            {
                counter++;
            }
        }
        if ( number != 0 && number != 1 && counter == 1 )
        {
            System.out.println ( number + " is a Prime number." );
        }
        else
        {
            System.out.println ( number + " is Not a Prime number!!!" );
        }
    }
    public static void main ( String[] args )
    {
        primeNumbers();
    }
}
