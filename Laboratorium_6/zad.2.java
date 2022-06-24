import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> tablica = new ArrayList<>();
        while(in.hasNext()) {
            for (String s: in.nextLine().split(" ")) {
                tablica.add(s.toUpperCase());
            }
        }
        System.out.println(tablica.toString());
    }
}