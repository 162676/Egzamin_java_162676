import java.util.Scanner;

public class zad2_1_f {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 1.(f");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę parzyste z nieparzystym indeksem");
        int drugief = scan.nextInt();
        float drugien = 0;
        for (int i = 1; i <= drugief; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są parzyste i mają indeks nieparzysty");
            int liczbyf = scan.nextInt();
            if (liczbyf % 2 == 0 && i % 2 != 0) {

                drugien += 1;
            }
        }
        System.out.println(drugien);
    }
}
