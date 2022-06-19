import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku (wraz z rozszerzeniem): ");
        String input = scanner.nextLine();

        if (Files.exists(Path.of(input))) {
            System.out.println("Ten plik istnieje");
        } else
            System.out.println("Ten plik nie istnieje");
        scanner.close();
    }
}