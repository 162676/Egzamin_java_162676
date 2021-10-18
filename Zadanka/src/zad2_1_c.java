import java.util.Scanner;

import static java.lang.Math.abs;

public class zad2_1_c {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 1.(C");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę te, które są kwadratami liczb parzystych");
        int drugiec = scan.nextInt();
        float drugiez = 0;
        for (int i = 1; i <= drugiec; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzić czy są kwadratami liczby parzystych");
            int liczbyc = scan.nextInt();
            if (abs(liczbyc) % 2 == 0) {

                drugiez += 1;
            }
        }
        System.out.println(drugiez);
    }
}
