import java.util.Random;
import java.util.Scanner;
public class Zad1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, które chcesz do siebie dodać");
        int n = scan.nextInt ();
        int suma = 0;
        for (int i=0;i<n;i++)
        {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Podaj  liczby, które chcesz do siebie dodać");
            int z = scan.nextInt();
            suma+=z;
        }
        System.out.println("Suma podanych liczb to: " + suma);
    }
}
