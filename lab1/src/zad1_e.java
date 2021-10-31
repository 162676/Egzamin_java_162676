import java.util.Scanner;

import static java.lang.Math.abs;

public class zad1_e {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (e");
        Scanner Mnoz = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz mnożyć");
        int q = Mnoz.nextInt();
        float wynikPie = 1;
        for (int i = 0; i < q; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz mnożyć");
            float a = scane.nextInt();
            wynikPie *= abs(a);
        }
        System.out.println("Wynik mnożenia wynosi: " + wynikPie);
    }
}
