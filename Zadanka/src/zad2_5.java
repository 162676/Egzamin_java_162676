import java.util.Scanner;

public class zad2_5 {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 5");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę pary podane w zadaniu");
        int zadanie25 = scan.nextInt();
        double[] lista2 = new double[zadanie25];
        int wynik25 = 0;
        for (int i = 1; i <= zadanie25; i++) {
            System.out.println("Podaj liczbe");
            double a = scan.nextDouble();
            lista2[i] = a;
        }
        for (int i = 1; i <= zadanie25 - 1; i++) {
            if (lista2[i] > 0 && lista2[i + 1] > 0) {
                wynik25++;
            }
        }
        System.out.println("Liczba par" + wynik25);
    }
}
