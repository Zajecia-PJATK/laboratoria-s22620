public class Main {

    public static void main(String[] args) {
        int[] tab = {2, 4, 6, 8 ,10};
        Main klasa = new Main();
        System.out.println(klasa.search(tab, 8) + "\n");
        System.out.println(klasa.search(tab, 9));
    }

    int search(int[] arr, int num) {
        int index = -1;
        try {
            for (int i=0; i < arr.length; i++) {
                if (arr[i] == num) {
                    index = i;
                }
            }
            if (index == -1)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("Elementu nie znaleziono");
        }
        return index;
    }
}