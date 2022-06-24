import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int number;
        String str = in.nextLine();

        try
        {
            number = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            System.out.println(str + " nie jest liczbą.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Błędny format liczby.");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}