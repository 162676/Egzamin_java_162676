import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class zad1_d {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (d");
        Scanner Pani = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz dodać");
        int z = Pani.nextInt();
        float wynikPier = 0;
        for (int i = 0; i < z; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz dodać");
            float a = scane.nextInt();
            wynikPier += sqrt(abs(a));
        }
        System.out.println("Suma wynosi: " + wynikPier);
    }
}
