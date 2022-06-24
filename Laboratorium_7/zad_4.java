import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputKeyb = new Scanner(System.in);

        System.out.println("Podaj nazwę pierwszego pliku: ");
        String nazwa1 = inputKeyb.nextLine();

        System.out.println("Podaj nazwę drugiego pliku");
        String nazwa2 = inputKeyb.nextLine();

        File file2 = new File(nazwa2);

        try (PrintWriter output2 = new PrintWriter(new FileWriter(file2, true))) {
            String content1 = Files.readString(Path.of(nazwa1), StandardCharsets.UTF_8);
            output2.print(content1);
        } catch (Exception e) {
            System.out.println("Nie ma takiego pliku");
        }
        inputKeyb.close();
    }
}