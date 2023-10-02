public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.print("Prime numbers from 1 to 100: ");
        for(int i=2; i<=100; i++) {
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0) {
                if(i == 2) {
                    System.out.print(i + ",");
                } else if (i == 3) {
                    System.out.print(i + ",");
                }else if (i == 5) {
                    System.out.print(i + ",");
                }else if (i == 7) {
                    System.out.print(i + ",");
                }
            }else {
                System.out.print(i + ",");
            }
        }
    }
}
