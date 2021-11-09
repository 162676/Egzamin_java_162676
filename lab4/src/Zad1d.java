import java.util.Scanner;
public class Zad1d {
    public static String repeat(String str,int n)
    {
        String zmienna;
        zmienna = str.repeat(n);
        return zmienna;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Jakie słowo chcesz powtórzyć programisto!");
    String slowo = scanner.nextLine();
    System.out.println("Ile razy?");
    int n = scanner.nextInt();
    System.out.println("Słowo powtórzone " + n + " razy to: " + repeat(slowo,n));
    }
}
