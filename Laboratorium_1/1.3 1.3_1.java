import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine().toLowerCase();

        boolean flag = true;
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
