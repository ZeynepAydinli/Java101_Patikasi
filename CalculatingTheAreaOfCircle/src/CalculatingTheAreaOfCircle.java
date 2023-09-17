import java.util.Scanner;
public class CalculatingTheAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, a, pi=3.14, result;

        System.out.print("Please enter the angle of the circle: ");
        a = input.nextDouble();
        System.out.print("Please enter the radius of the circle: ");
        r = input.nextDouble();

        result = (pi*(r*r)*a)/360;

        System.out.print("Area of the circle: ");
        System.out.println(result);

    }
}
