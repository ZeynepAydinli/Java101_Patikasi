public class CharWithStar {
    public static void main(String[] args) {

        // Writing the char Z on the screen

        String[][] array = new String[4][4];

        for (int i=0; i < array.length; i++) {
            for(int j=0; j < array[i].length; j++) {
                if (i == 0 || i == 3) {
                    array[i][j] = (" * ");

                } else if (i == 1 && j == 2) {
                    array[i][j] = (" * ");

                } else if (i == 2 && j == 1) {
                    array[i][j] = (" * ");

                } else {
                    array[i][j] = ("   ");
                }
            }
        }
        for (String[] row : array) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
