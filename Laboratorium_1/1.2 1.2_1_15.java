import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        try {
            // first set of data, dimensions of the matrix
            String[] sizeString = in.nextLine().split(" ");

            int[] size = new int[2];
            for (int i = 0; i < sizeString.length; i++) {
                size[i] = Integer.parseInt(sizeString[i]);
            }

            // receiving row values
            String[][] matrix = new String[size[0]][size[1]];

            for (int i = 0; i < size[0]; i++) {
                matrix[i] = in.nextLine().split(" ");
            }

            // print output
            for (int i = 0; i < size[1]; i++) {
                for (int j = 0; j < size[0]; j++) {
                    System.out.print(matrix[j][i]);
                    if (j < size[0] - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            System.out.println("BŁĄD");
        }
    }
}