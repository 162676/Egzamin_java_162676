
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class zad1f {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, które chcesz do siebie dodać");
        int n = scan.nextInt ();
        float suma = 0;
        for (int i=0;i<n;i++)
        {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby ");
            float a = scane.nextInt();
            suma += a*pow(-1,i + 1);
        }
        System.out.println("Suma podanych liczb to: " + suma);
    }
}
