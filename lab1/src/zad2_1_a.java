import java.util.Scanner;

public class zad2_1_a {
    public static void main(String[] args) {
        System.out.println("\n ZADANIE 2 1.(a");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę nieparzyste");
        int drugie = scan.nextInt();
        float drugiew = 0;
        for (int i = 1; i <= drugie; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są nieparzyste");
            int liczby = scan.nextInt();
            if (liczby % 2 != 0) {

                drugiew += 1;
            }
        }
        System.out.println(drugiew);
    }
}
