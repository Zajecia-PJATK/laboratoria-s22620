import java.util.*;

class Hamster {
    private int hamsterNumber;
    private String name;
    Hamster(int i) { hamsterNumber = i; }
    Hamster(int i, String n){
        hamsterNumber = i;
        name = n;
    }
    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + " " + name;
    }
}

class Printer {
    static void printAll(List<Hamster> hl) {
        Iterator<Hamster> iter = hl.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().hamsterNumber());
        }
        System.out.println();
    }

    public static void printAll(Map<String, Hamster> map) {
        String name;
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
            name = iter.next();
            System.out.println(map.get(name).hamsterNumber());
        }
        System.out.println();
    }
}

class HamsterMaze {
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<>();
        Map<String, Hamster> vMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String name = "unknown";
        int id=0;
        boolean flag = false;

        for(int i = 0; i < 3; i++) {
            System.out.println("Podaj imie " + (i+1) + "-go gryzonia");
            if(in.hasNext()) {
                name = in.next();
            }
            // proba wpisania numeru
            do {
                flag = false;
                System.out.println("Podaj numer id " + (i+1) + "-go gryzonia");
                try {
                    if(in.hasNextInt()) {
                        id = in.nextInt();
                    } else if(in.hasNext()) {
                        in.next();
                        throw new InputMismatchException("Niewłaściwy format liczby!\n");
                    }
                    if (id < 0) {
                        throw new InputMismatchException("Liczba powinna być dodatnia\n");
                    }
                } catch (InputMismatchException e) {
                    flag = true;
                    System.out.println(e.getMessage());
                }
            } while (flag);
            v.add(new Hamster(id, name));
            vMap.put(name, v.get(i));
        }
        in.close();
        System.out.println("To jest List");
        Printer.printAll(v);
        System.out.println("To jest Map");
        Printer.printAll(vMap);

        remove(2,v);    // usuwam element z pozycji drugiej z listy
        remove(2, vMap); // usuwam element z pozycji drugiej ze słownika
        System.out.println("To jest lista po usunięciu");
        Printer.printAll(v);
        System.out.println("To jest słownik po usunięciu");
        Printer.printAll(vMap);
    }

    static void remove(int pos, List list) {
        System.out.println("Usuwam " + pos + " element z listy\n");
        Iterator iter = list.iterator();
        for (int i = 0; i < pos; i++) {
            if (iter.hasNext()) {
                iter.next();
            }
        }
        iter.remove();
    }

    static void remove(int pos, Map map) {
        System.out.println("Usuwam " + pos + " element ze słownika\n");
        Iterator iter = map.keySet().iterator();
        for (int i = 0; i < pos; i++) {
            if (iter.hasNext()) {
                iter.next();
            }
        }
        iter.remove();
    }
}




