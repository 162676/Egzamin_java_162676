import java.util.Scanner;
public class zad1_i {
    public static int silnia(int numerWyrazu) {

        int wynikSilni = 1;
        for (int i = 1; i <= numerWyrazu; i++) {
            wynikSilni *= i;
        }
        return wynikSilni;
    }
    public static void main(String[] args) {
        System.out.println("Zadanie 1 (i");
        Scanner scaneone = new Scanner(System.in);
        System.out.println("Podaj ilosć liczb");
        int j = scaneone.nextInt();
        float wynik3 = 0;
        for (int i = 1; i <= j; i++) {
            System.out.println("Podaj liczby ");
            float a = scaneone.nextInt();
            wynik3 += Math.pow(-1, i) * (wynik3 / silnia(i));
        }
        System.out.println("Wynik końcowy wynosi: " + wynik3);
    }
}
