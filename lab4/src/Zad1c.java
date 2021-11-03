import java.util.Scanner;
public class Zad1c {
    public static String Middle(String str) {
        int pozycja;
        int len;
        if (str.length() % 2 == 0) {
            pozycja = str.length() /2 -1;
            len=2;
        }
        else
        {
            pozycja = str.length()/2;
            len=1;
        }
        return str.substring(pozycja, pozycja + len);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        System.out.print("> ");
        String str = in.nextLine();
        System.out.print("Srodkowa litera to: " + Middle(str)+"\n");
    }
}
