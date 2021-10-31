import java.util.Scanner;

public class zad2_1_b {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 1.(b");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę te podzielne przez 3 i niepodzielne przez 5");
        int drugieb = scan.nextInt();
        float drugiey = 0;
        for (int i = 1; i <= drugieb; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są podzielne przez 3 i niepodzielne przez 5");
            int liczbyb = scan.nextInt();
            if (liczbyb % 3 == 0 && liczbyb % 5 != 0) {

                drugiey += 1;
            }
        }
        System.out.println(drugiey);
    }
}
