import java.util.Scanner;

public class zad2_1_g {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 1.(g");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę nieparzyste i nieujemne");
        int drugieg = scan.nextInt();
        float drugieh = 0;
        for (int i = 1; i <= drugieg; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są nieparzyste i nieujemne");
            int liczbyg = scan.nextInt();
            if (liczbyg % 2 != 0 && liczbyg > 0) {

                drugieh += 1;
            }
        }
        System.out.println(drugieh);
    }
}
