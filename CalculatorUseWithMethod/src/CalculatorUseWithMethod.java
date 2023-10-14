import java.util.Scanner;
public class CalculatorUseWithMethod {
    static void sum() {
        Scanner scan = new Scanner ( System.in );
        int counter, number, result = 0;
        System.out.print("Have many will you enter number? ");
        counter = scan.nextInt();
        for( int i=1; i<=counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("\nResult: " + result + "\n");
    }

    static void sub() {
        Scanner scan = new Scanner ( System.in );
        int counter, number, result = 0;
        System.out.print("Have many will you enter number? ");
        counter = scan.nextInt();
        for( int i=1; i<=counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if(i==1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("\nResult: " + result + "\n");
    }

    static void mult() {
        Scanner scan = new Scanner ( System.in );
        int counter, number, result = 1;
        System.out.print("Have many will you enter number? ");
        counter = scan.nextInt();
        for( int i=1; i<=counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            result *= number;
        }
        System.out.println("\nResult: " + result + "\n");
    }

    static void division() {
        Scanner scan = new Scanner ( System.in );
        int counter, number;
        double result = 0;
        System.out.print("Have many will you enter number? ");
        counter = scan.nextInt();
        for( int i=1; i<=counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("You can not enter zero as the divisor!!!");
                continue;
            }
            if (i == 1) {
              result = number;
              continue;
            }
            result /= number;
        }
        System.out.println("\nResult: " + result + "\n");
    }
    static void exponential() {
        Scanner scan = new Scanner(System.in);
        int base, exponent, result = 1;
        System.out.print("Please enter base number: ");
        base = scan.nextInt();
        System.out.print("Please enter exponent number: ");
        exponent = scan.nextInt();
        if (base == 0 && exponent == 0) {
            System.out.println("\nindefinite number!!!\n");
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            System.out.println("\nResult: " + result + "\n");
        }
    }
    static void factorial() {
        int fact, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter factorial: ");
        fact = scan.nextInt();
        for(int i=1; i<=fact; i++) {
            result *= i;
        }
        System.out.println("\nResult: " + result + "\n");
    }
    static void mode() {
        int num1, num2, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = scan.nextInt();
        System.out.print("Please enter second number: ");
        num2 = scan.nextInt();
        if(num2 != 0) {
            result = num1 % num2;
            System.out.println("\nResult: " + result + "\n");
        }else {
            System.out.println("\nThe second number must not be 0\n");
        }
    }
    static void rectangle() {
        int num1, num2, perimeter, area;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter long edge of rectangle: ");
        num1 = scan.nextInt();
        System.out.print("Please enter short edge of rectangle: ");
        num2 = scan.nextInt();
        perimeter = 2*(num1+num2);
        area = num1*num2;
        System.out.println("\nPerimeter of rectangle: " + perimeter);
        System.out.println("Area of rectangle: " + area + "\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        int select;
        String menu = """
               1- Addition
               2- Subtraction
               3- Multiplication
               4- Division
               5- Exponential
               6- Factorial
               7- Mode
               8- Rectangle Perimeter and Area Calculation
               0- Exit""";

        do
        {
            System.out.println ( menu );
            System.out.print ( "Please enter operation: " );
            select = scan.nextInt ();
            switch (select) {

                case 1:
                    sum();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponential();
                    break;
                case 6:
                    factorial();
                    break;

                case 7:
                    mode();
                    break;

                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println ( "Logged out" );
                    break;
                default:
                    System.out.println ( "Wrong number is entered.Try again!" );
            }
        } while (select != 0);
    }
}
