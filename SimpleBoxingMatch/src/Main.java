public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Lilly",10, 100, 70, 60.0);
        Fighter f2 = new Fighter("Pelte", 15, 100, 80, 40.0);

        // Lilly and Pelte are my cats' names. :)

        Ring r1 = new Ring(f1, f2, 65, 85);
        r1.run();
    }
}
