import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Zad2g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int wynik = 0;
        double tab[] = new double[n];
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ilość liczb, które chcesz wczytać");
            int z = scan.nextInt();
            tab[i] = z;
        }
        for(int i=0;i<n;i++)
        {
            if((abs(tab[i]))<pow(i,2))
            {
                System.out.println(tab[i] + " To ten element listy essa byku działa!");
                wynik++;
            }
        }
        System.out.println("Wynik który otrzymujesz tooooo .... emocje wiem ... zaraz powiem ... i ... " + wynik);
    }
}
