import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Wpisz nazwę pliku");
        String fileName = keyboardInput.nextLine();
        try {
            String content = Files.readString(Path.of(fileName));
            String newName = fileName.split("\\.")[0];
            PrintWriter printWriter = new PrintWriter(new FileWriter(newName + ".dat"), true);
            for (int i = 0; i < content.length(); i++) {
                int codePoint = content.codePointAt(i);
                printWriter.print(Integer.toBinaryString(codePoint));
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Nie ma takiego pliku");
        }
        keyboardInput.close();
    }
}