import java.util.Scanner;

public class zad1_a {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (a");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz dodać");
        int n = scan.nextInt();
        float pusta = 0;
        for (int i = 0; i < n; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz dodać");
            float a = scan.nextInt();
            pusta += a;
        }
        System.out.println("Suma wynosi: " + pusta);
    }
}
