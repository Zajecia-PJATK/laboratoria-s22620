public class Main {
    public static void main(String[] args) {
	    int[] wyniki = {24, 76, 50, 10};
        TestScores scores = new TestScores(wyniki);
        System.out.println(scores.average());

        int[] wyniki2 = {24, 76, 50, 10, 101};
        TestScores scores2 = new TestScores(wyniki2);
        System.out.println(scores2.average());
    }
}
class TestScores {
    int[] scores;

    public TestScores(int[] s) {
        try {
            for (int n: s) {
                if(n < 0 || n > 100) {
                    throw new IllegalArgumentException("Wynik z tablicy wykracza poza zakres");
                }
            }
            scores = s;
        } catch (IllegalArgumentException e) {
            scores = new int[0];
            System.out.println(e.getMessage());
        }
    }

    double average() {
        double average = 0;
        for (int n: scores) {
            average += n;
        }
        return average/scores.length;
    }
}