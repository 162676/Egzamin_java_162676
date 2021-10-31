import java.util.Scanner;

public class zad2_4 {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 4");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb,z których wybiorę największą i najmniejszą");
        int drugie4 = scan.nextInt();
        System.out.println("Podaj pierwszą  liczbę");
        float min = scan.nextInt(); //pierwszą liczbę przypisujemy do min
        System.out.println("Podaj ponownie pierwszą  liczbę");
        float max = scan.nextInt();
        for (int i = 1; i <= drugie4 - 1; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, z których znajdę największą i najmniejszą");
            int liczby3 = scan.nextInt();
            if (min > liczby3) {
                min = liczby3;
            }
            if (max < liczby3) {
                max = liczby3;
            }
        }
        System.out.println("Najmniejszą liczbą jest " + min);
        System.out.println("Największą liczbą jest " + max);

    }
}
