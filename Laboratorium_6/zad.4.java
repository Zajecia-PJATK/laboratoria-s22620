import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> zbiorA = new HashSet<>();
        HashSet<Integer> zbiorB = new HashSet<>();

        for (String num: in.nextLine().split(" ")) {
            zbiorA.add(Integer.parseInt(num));
        }
        for (String num: in.nextLine().split(" ")) {
            zbiorB.add(Integer.parseInt(num));
        }
        in.close();

        HashSet<Integer> aMinusB = new HashSet<>();
        HashSet<Integer> bMinusA = new HashSet<>();
        aMinusB.addAll(zbiorA);
        bMinusA.addAll(zbiorB);
        aMinusB.removeAll(zbiorB);
        bMinusA.removeAll(zbiorA);

        aMinusB.addAll(bMinusA);
        System.out.println(aMinusB.toString());
    }
}