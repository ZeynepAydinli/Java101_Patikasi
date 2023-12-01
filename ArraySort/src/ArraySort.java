import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.print("Enter size of array: ");
        size = scan.nextInt();
        int[] array = new int[size];

        for (int i=0; i<size; i++){
            System.out.print((i+1) + ". element: ");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array Sort = " + Arrays.toString(array));

    }
}
