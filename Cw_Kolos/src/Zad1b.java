import java.util.Random;
import java.util.Scanner;
public class Zad1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, które chcesz do siebie mnożyć");
        int n = scan.nextInt ();
        int suma = 1;
        for (int i=0;i<n;i++)
        {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Podaj  liczby, które chcesz do siebie mnożyć");
            int z = scan.nextInt();
            suma*=z;
        }
        System.out.println("Iloczyn podanych liczb to: " + suma);
    }
}