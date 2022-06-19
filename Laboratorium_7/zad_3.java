import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inputKeyb = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");
        String input = inputKeyb.nextLine();

        try {
            List<String> lines = Files.readAllLines(Path.of(input), StandardCharsets.UTF_8);
            long linesCounter = lines.size(), lettersCounter, digitsCounter, whitesCounter;

            String content = Files.readString(Path.of(input), StandardCharsets.UTF_8);

            Pattern lettersPattern = Pattern.compile("[A-Za-z]");
            Matcher lettersMatcher = lettersPattern.matcher(content);
            lettersCounter = lettersMatcher.results().count();

            Pattern digitsPattern = Pattern.compile("\\d");
            Matcher digitsMatcher = digitsPattern.matcher(content);
            digitsCounter = digitsMatcher.results().count();

            Pattern whitesPattern = Pattern.compile("\\s");
            Matcher whitesMatcher = whitesPattern.matcher(content);
            whitesCounter = whitesMatcher.results().count();

            System.out.println("Ilość linii: " + linesCounter);
            System.out.println("Ilość liter: " + lettersCounter);
            System.out.println("Ilość cyfr: " + digitsCounter);
            System.out.println("Ilość białych znaków: " + whitesCounter);
        } catch (NoSuchFileException e) {
            System.out.println("Nie ma takiego pliku");
        }
        inputKeyb.close();
    }
}