import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ziemiaSek = 31557600;
        double merkurySek = ziemiaSek*0.2408467;
        double wenusSek = ziemiaSek*0.61519726;
        double marsSek = ziemiaSek*1.8808158;
        double jowiszSek = ziemiaSek*11.862615;
        double saturnSek = ziemiaSek*29.447498;
        double uranSek = ziemiaSek*84.016846;
        double neptunSek = ziemiaSek*164.79132;


        int sek = sc.nextInt();
        String planeta = sc.next();
        double lata = 0;
        if(planeta.equals("Ziemia")) lata = sek/ziemiaSek;
        else if(planeta.equals("Merkury")) lata = sek/merkurySek;
        else if(planeta.equals("Wenus")) lata = sek/wenusSek;
        else if(planeta.equals("Mars")) lata = sek/marsSek;
        else if(planeta.equals("Jowisz")) lata = sek/jowiszSek;
        else if(planeta.equals("Saturn")) lata = sek/saturnSek;
        else if(planeta.equals("Uran")) lata = sek/uranSek;
        else if(planeta.equals("Naptun")) lata = sek/neptunSek;

        System.out.println(Math.round(lata * 100.0) / 100.0);


    }
}
