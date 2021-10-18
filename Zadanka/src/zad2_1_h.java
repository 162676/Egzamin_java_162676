import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.abs;
public class zad2_1_h {
    public static void main(String[] args) {
        System.out.println("Podaj ilosc liczb");
        Scanner scan = new Scanner(System.in);
        int zmienna = scan.nextInt();
        int pusta = 0;
        int[] listaZad21 = new int[zmienna];
        for (int i = 0; i < zmienna; i++) {
            System.out.println("Podaj liczby ");
            int a = scan.nextInt();
            listaZad21[i] = a;
        }
        for (int i = 0; i < zmienna; i++) {
            if (abs(listaZad21[i]) < pow(i, 2))
            {
                pusta++;
            }
            System.out.println("Ilosc liczb pełniających warunki zadania wynosi wynosi:" + pusta);
        }
    }
}
