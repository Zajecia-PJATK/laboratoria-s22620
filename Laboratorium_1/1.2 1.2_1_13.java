import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int number = 0;
        String input;

       
        while (!(number > 0)) {
            input = in.next();
            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                number = 0;
            }
        }

        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        
        for (int i = number; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int j = number - i; j < number; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = number - i; j <= number; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}