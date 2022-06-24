import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać nazwę pliku: ");
        String input = scanner.nextLine();

        PrintWriter printWriter = new PrintWriter(new FileWriter(input, true));

        System.out.println("Co chcesz zapisać?");
        input = scanner.nextLine();
        printWriter.println(input);
        printWriter.close();
        scanner.close();
    }
}