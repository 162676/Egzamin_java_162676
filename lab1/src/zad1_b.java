import java.util.Scanner;

public class zad1_b {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (b");
        Scanner Scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz mnożyć");
        int x = Scan.nextInt();
        float wynik = 1;
        for (int i = 0; i < x; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz mnożyć");
            float a = Scan.nextInt();
            wynik *= a;
        }
        System.out.println("Wynik mnożenia wynosi: " + wynik);
    }
}
