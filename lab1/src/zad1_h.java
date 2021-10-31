import java.util.Scanner;

import static java.lang.Math.pow;

public class zad1_h {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (h");
        Scanner scaneone = new Scanner(System.in);
        System.out.println("Podaj ilosć liczb");
        int h = scaneone.nextInt();
        float wynik2 = 0;
        for (int i = 1; i <= h; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby ");
            float a = scane.nextInt();
            wynik2 += a * pow(-1, i + 1);
        }
        System.out.println("Wynik końcowy wynosi: " + wynik2);
    }
}
