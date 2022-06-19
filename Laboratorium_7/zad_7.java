import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String fileName = keyboardInput.nextLine();
        try {
            long size = Files.size(Path.of(fileName));
            System.out.println("Rozmiar pliku wynosi " + size + " bajtów");
        } catch (IOException e) {
            System.out.println("Nie ma takiego pliku");
        }
        keyboardInput.close();
    }
}