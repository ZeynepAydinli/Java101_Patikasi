import java.util.Scanner;
public class CalculatingTheAreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,u,area;

        System.out.print("Please enter \"a\" side of the triangle: ");
        a = input.nextDouble();
        System.out.print("Please enter \"b\" side of the triangle: ");
        b = input.nextDouble();
        System.out.print("Please enter \"c\" side of the triangle: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Area Of Triangle: ");
        System.out.println(area);


    }
}
