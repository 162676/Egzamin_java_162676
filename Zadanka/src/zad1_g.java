import java.util.Scanner;

public class zad1_g {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (g");
        Scanner DodMno = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz dodać i mnożyć");
        int l = DodMno.nextInt();
        float Dodawanie = 0;
        float Mnozenie = 1;
        for (int i = 0; i < l; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz dodać");
            float a = scane.nextInt();
            Dodawanie += a;
        }
        System.out.println("Wynik dodawania wynosi: " + Dodawanie);
        for (int i = 0; i < l; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz mnożyć");
            int a = scane.nextInt();
            Mnozenie *= a;
        }
        System.out.println("Wynik mnożenia wynosi: " + Mnozenie);
    }
}
