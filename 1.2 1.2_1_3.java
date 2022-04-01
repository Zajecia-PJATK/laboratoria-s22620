import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double a, b, wynik;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());

        wynik = a * b;

        System.out.println(wynik);
    }
}
