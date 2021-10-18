import java.util.Scanner;

public class zad22 {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb,z których wybiorę dodatnie i wypisze ich podwojoną sumę");
        int drugiej = scan.nextInt();
        float drugiel = 0;
        for (int i = 1; i <= drugiej; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są parzyste i mają indeks nieparzysty");
            int liczbyj = scan.nextInt();
            if (liczbyj > 0) {
                drugiel += liczbyj;
            } else {
                continue;
            }
        }
        System.out.println(2 * drugiel);
    }
}
