import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> zbior = new TreeSet<>();

        while (in.hasNext()) {
            zbior.add(in.nextInt());
        }
        System.out.println(zbior.toString());
    }
}