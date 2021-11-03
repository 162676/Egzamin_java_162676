import java.util.Scanner;
public class Zad1d {
    public static String Repeat(String str,int n)
    {
        String zmienna = str.repeat(n);
        return zmienna;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj slowo ktore chcesz powótrzyć");
       String str = scanner.nextLine();
       System.out.println("Podaj ile razy chcesz powtórzyć");
       int n = scanner.nextInt();
       System.out.println("Słowo to: " + Repeat(str,n));
    }
}
