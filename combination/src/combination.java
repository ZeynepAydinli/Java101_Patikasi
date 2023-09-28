import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, nFact, rFact, nrFact, comb;

        System.out.print("Please enter a number of n for the combination: ");
        n = scan.nextInt();

        System.out.print("Please enter a number of r for the combination: ");
        r = scan.nextInt();

        nFact = 1;
        for(int i=1; i<=n; i++) {
            nFact *= i;
        }

        rFact = 1;
        for(int x=1; x<=r; x++) {
            rFact *= x;
        }

        nrFact = 1;
        for(int y=1; y<=(n-r); y++) {
            nrFact *= y;
        }

        comb = (nFact / (rFact * nrFact));

        System.out.println("Combination: " + comb);
    }
}
