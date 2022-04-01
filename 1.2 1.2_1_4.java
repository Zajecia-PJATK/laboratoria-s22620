import java.text.DecimalFormat;
import static java.lang.Math.*;

public class Main {
    private static final DecimalFormat DF = new DecimalFormat("#.##");

    public static void main(String[] args) {
        double wynik = sqrt(PI);

        System.out.print(DF.format(wynik));
    }
}