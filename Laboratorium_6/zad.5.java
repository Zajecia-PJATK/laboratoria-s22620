import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, Integer> slownik = new TreeMap();

            while (in.hasNext()) {
                for (String s: in.next().toLowerCase().split(" ")) {
                    if (slownik.containsKey(s)) {
                        slownik.put(s, slownik.get(s) + 1);
                    } else
                        slownik.put(s, 1);
                }
            }
            in.close();
        System.out.println(slownik.toString());
    }
}