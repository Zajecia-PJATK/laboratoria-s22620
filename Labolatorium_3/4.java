import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandomNumbers.randomElement());
    }
}

class RandomNumbers {
    static final int[] elements = {1, 4, 5, 9, 13, 21,22, 106,};
    static int randomElement() {
        int index = (int)Math.floor(Math.random() * elements.length);
        return elements[index];
    }
}