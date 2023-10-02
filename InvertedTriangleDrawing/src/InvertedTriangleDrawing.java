import java.util.Scanner;
public class InvertedTriangleDrawing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter the height of the triangle: ");
        n = scan.nextInt();

        for(int i=n; i>=1; i--) {
            for (int s=1; s<=(n-i); s++) {
                System.out.print(" ");
            }
            for (int k=1; k<=((2 * i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
