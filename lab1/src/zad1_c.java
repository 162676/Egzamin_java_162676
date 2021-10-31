import java.util.Scanner;
import static java.lang.Math.abs;

public class zad1_c {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (c");
        Scanner Pan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz dodać");
        int y = Pan.nextInt();
        float wynikBez = 0;
        for (int i = 0; i < y; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz dodać");
            float a = Pan.nextInt();
            wynikBez += abs(a);
        }
        System.out.println("Suma wynosi: " + wynikBez);
    }
}
