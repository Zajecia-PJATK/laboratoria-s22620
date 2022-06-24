public interface Analyzable {
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}


public class CourseGrades implements Analyzable {
    private ArrayList<GradedActivity> grades;

    public CourseGrades() {
        grades = new ArrayList<>();
    }

    public ArrayList<GradedActivity> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<GradedActivity> grades) {
        this.grades = grades;
    }

    public void addScore(double s) {
        GradedActivity tmp = new GradedActivity();
        tmp.setScore(s);
        grades.add(tmp);
    }

    @Override
    public double getAverage() {
        double summary = 0;
        for (GradedActivity element: grades) {
            summary += Double.parseDouble(String.valueOf(element.getGrade()));
        }
        return summary / grades.size();
    }

    @Override
    public GradedActivity getHighest() {
        double highest = 0;
        int index = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getScore() > highest) {
                highest = grades.get(i).getScore();
                index = i;
            }
        }
        return grades.get(index);
    }

    @Override
    public GradedActivity getLowest() {
        int index = 0;
        double lowest = grades.get(index).getScore();
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i).getScore() < lowest) {
                lowest = grades.get(i).getScore();
                index = i;
            }
        }
        return grades.get(index);
    }
}




public class GradedActivity {
    private double score; // Wynik punktowy.

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}


public class Main {
    public static void main(String[] args) {
        CourseGrades s22051 = new CourseGrades();
        s22051.addScore(45);
        s22051.addScore(75);
        s22051.addScore(89);
        System.out.println("Średnia z ocen to: " + s22051.getAverage());
        System.out.println("Najwyższa ilość punktów to " + s22051.getHighest().getScore() + " co daje ocenę " + s22051.getHighest().getGrade());
        System.out.println("Najniższa ilość punktów to " + s22051.getLowest().getScore() + " co daje ocenę " + s22051.getLowest().getGrade());
    }
}
