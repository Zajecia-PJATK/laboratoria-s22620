import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Hamster implements Comparable<Hamster> {
    private int hamsterNumber;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }

    @Override
    public int compareTo(Hamster o) {
        if (hamsterNumber > o.getHamsterNumber()) {
            return 1;
        } else if (hamsterNumber < o.getHamsterNumber()) {
            return -1;
        } else
            return 0;
    }
}

class Printer {
    static void printAll(List<Hamster> hl) {
        for (Hamster hamster : hl) {
            System.out.println(hamster.hamsterNumber());
        }
        System.out.println();
    }
}

class HamsterMaze {
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 20; i++) {
            v.add(new Hamster(generator.nextInt(11)));
        }

        System.out.println("Przed sortowaniem");
        Printer.printAll(v);
        Collections.sort(v);
        System.out.println("Po sortowaniu");
        Printer.printAll(v);
    }
}


