import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("data.csv"), StandardCharsets.UTF_8);
            TreeMap<String, Integer> currency = new TreeMap<>();
            long counter = 0;
            Pattern pattern = Pattern.compile("\\.com$");
            for (String s : lines) {
                String[] tab = s.split(",");
                // ile osob zarabia w danej walucie
                if (!tab[5].contains("currency")) {
                    currency.put(tab[5], currency.getOrDefault(tab[5], 0) + 1);
                }
                // ilosc osob majacych email, gdzie na koncu jest .com
                Matcher matcher = pattern.matcher(tab[3]);
                if (matcher.find()) {
                    counter++;
                }
            }
            System.out.println("Zestawienie, ile osób zarabia w danej walucie.");
            System.out.println(currency.toString());
            System.out.println("Ilość osób z mailem zakończonym .com to " + counter);
        } catch (IOException e) {
            System.out.println("Nie ma takiego pliku");
        }
    }
}