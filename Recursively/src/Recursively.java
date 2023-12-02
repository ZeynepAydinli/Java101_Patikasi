import java.util.Scanner;
public class Recursively {

    public static void main(String[] args) {
       // recursively();
        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Please enter number : " );
        int number = scan.nextInt ();
        PatternMethod pattern = new PatternMethod ();
        pattern.patternCalculator ( number , number , true );

    }
}
