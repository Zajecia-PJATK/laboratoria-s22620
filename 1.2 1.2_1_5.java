import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Dodawanie: " + a + " + " + b + " = " + (a + b));
        System.out.println("Odejmowanie: " + a + " - " + b + " = " + (a - b));
        System.out.println("Mnożenie: " + a + " * " + b + " = " + (a * b));
        System.out.println("Dzielenie modulo: " + a + " mod " + b + " = " + floorMod(a, b));
    }
}
