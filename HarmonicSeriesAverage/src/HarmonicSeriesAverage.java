public class HarmonicSeriesAverage {
    public static void harmonicAverage(double[] array) {
        double sum = 0;
        double average;

        for(int i=0; i<array.length; i++) {
            sum += (1 / array[i]);
        }

        average = array.length / sum;
        System.out.println("Harmonic Series Average: " + average);
    }
    public static void main(String[] args) {

        double a[] = {1.2, 3.2, 4.5};
        double b[] = {25, 34, 55, 74};
        harmonicAverage(a);
        harmonicAverage(b);
    }
}
