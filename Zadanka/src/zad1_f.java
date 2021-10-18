import java.util.Scanner;

public class zad1_f {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (f");
        Scanner Poteg = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz dodać");
        int c = Poteg.nextInt();
        float wynikPote = 0;
        for (int i = 0; i < c; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, których potęgi chcesz dodać");
            int a = scane.nextInt();
            wynikPote += a * a;
        }
        System.out.println("Suma wynosi: " + wynikPote);
    }
}
