import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        char[] letters = new char[100];

        // data input
        word = in.nextLine();

        // parse String characters into indices of an array
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }

        // algorithm for checking if the word is a palindrome
        boolean flag = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (letters[i] != letters[word.length() - i - 1]) {
                flag = false;
                break;
            }
        }

        // output
        if (flag) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
