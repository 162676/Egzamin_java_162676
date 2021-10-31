import java.util.Scanner;

public class zad2_1_e {
    public class zad2_1 {
        public static int silnia(int numerWyrazu) {

            int wynikSilni = 1;
            for (int i = 1; i <= numerWyrazu; i++) {
                wynikSilni *= i;
            }
            return wynikSilni;
        }

        public static void main(String[] args) {
            System.out.println("ZADANIE 2 1.(e");
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ilosc liczb");
            int ilosce = scan.nextInt();
            int[] tablica = new int[ilosce];
            int ilosc2e = 0;
            for (int i = 0; i < ilosce; i++) {
                System.out.print("Podaj liczbe: ");
                int a = scan.nextInt();
                tablica[i] = a;
            }
            for (int i = 0; i < ilosce; i++) {
                if ((Math.pow(2, i) < tablica[i]) && (silnia(i) > tablica[i])) {
                    ilosc2e += 1;
                }
            }
            System.out.println("Liczb spełniających podany warunek jest: " + ilosc2e);
        }
    }
}
