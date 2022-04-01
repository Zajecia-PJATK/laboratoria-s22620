import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
        Scanner in = new Scanner(System.in);

        try {
            String[] input = in.nextLine().split(" ");
            int[] numbers = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            int a = numbers[0];
            int b = numbers[1];
            int c = numbers[2];
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("BŁĄD");
            } else if (a + b > c && a + c > b && b + c > a) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } catch (NumberFormatException e) {
            System.out.println("BŁĄD");
        }
    }
}