import java.util.Arrays;
import java.util.Scanner;
public class MinMaxCalculation {
    public static void minMaxCalculation(int[] array){
        Scanner scan = new Scanner(System.in);

        Arrays.sort(array);

        int num;
        int min = array[0];
        int max = array[0];

        //It is a program that finds the nearest number smaller than the given number and
        //the nearest number larger than the given number among the elements in the array.
        System.out.print("Please enter number: ");
        num = scan.nextInt();

        for(int i : array){
            if( i < num){
                max = i;
            }
            if( i > num){
                min = i;
                break;
            }
        }
        System.out.println("Nearest number smaller than the entered number: " + max);
        System.out.println("The nearest number greater than the entered number: " + min);
    }
    public static void main(String[] args) {

        int[] a = {44, 3, 8, 101, 22};
        minMaxCalculation(a);
    }
}
