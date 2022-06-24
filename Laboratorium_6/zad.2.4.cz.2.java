import java.util.*;

class Hamster {
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
        // selection sort
        Hamster tmp = null;
        int tmpIndex = 0;
        int min;
        for (int i = 0; i < v.size()-1; i++) {
            min = v.get(i).getHamsterNumber();
            for (int j = i; j < v.size(); j++) {
                if (v.get(j).getHamsterNumber() < min) {
                    min = v.get(j).getHamsterNumber();
                    tmp = v.get(j);
                    tmpIndex = j;
                }
            }
            v.set(tmpIndex, v.get(i));
            v.set(i, tmp);
        }
        System.out.println("Po sortowaniu");
        Printer.printAll(v);
    }
}

