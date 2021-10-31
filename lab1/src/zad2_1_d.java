import java.util.Scanner;

public class zad2_1_d {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 1.(d");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        int iloscd = scan.nextInt();
        int ilosc2d = 0;
        int[] lista = new int[iloscd];
        for (int i = 0; i < iloscd; i++) {
            System.out.println("Podaj liczby ");
            int a = scan.nextInt();
            lista[i] = a;
        }
        for (int i = 0; i < iloscd; i++) {
            if (((lista[i - 1] + lista[i + 1]) / 2) > lista[i]) {
                ilosc2d++;
            }
            System.out.println("Ilosc liczb spełniających warunki zadania  wynosi:" + ilosc2d);
        }
    }
}
