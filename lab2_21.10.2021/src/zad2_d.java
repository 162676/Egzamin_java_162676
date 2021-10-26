import java.util.Random;
import java.util.Scanner;

public class zad2_d {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static int sumaDodatnich(int list[])
    {
        int sumaDodawania = 0;
        for(int i=0;i< list.length;i++) {
            if (list[i] > 0) {
                sumaDodawania += list[i];
            }
        }
        return sumaDodawania;
    }
    public static  int sumaUjemnych(int list[])
    {
        int sumaOdejmowania = 0;
        for(int i=0;i< list.length;i++) {
            if (list[i] < 0) {
                sumaOdejmowania += list[i];
            }
        }
        return sumaOdejmowania;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            System.out.println("Suma dodawania liczb dodatnich wynosi: " + sumaDodatnich(list) );
            System.out.println("Suma dodawania liczb ujemnych wynosi: " + sumaUjemnych(list) );
        }
    }

}
