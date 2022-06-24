import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Ile ostatnich linii wyświetlić?");
        try {
            int number = keyboardInput.nextInt();
            List<String> lines = Files.readAllLines(Path.of("plik.txt"), StandardCharsets.UTF_8);
            if (number < 0) {
                System.out.println("Wpisz liczbę");
            } else if (number >= lines.size()) {
                for (String s : lines) {
                    System.out.println(s);
                }
            } else {
                int index = lines.size() - number;
                for (int i = index; i < lines.size(); i++) {
                    System.out.println(lines.get(i));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Wpisz liczbę!");
        } catch (IOException e) {
            System.out.println("Plik plik.txt nie istnieje");
        }
        keyboardInput.close();
    }
}