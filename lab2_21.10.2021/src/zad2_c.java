import java.util.Random;
import java.util.Scanner;

public class zad2_c {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static int ileMaksymalnych(int []list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;
    }
    public static int ilosc(int []list)
    {
        int max = list[0];
        int ilosc = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        for(int i=0;i< list.length;i++)
        {
            if(list[i]==max)
            {
                ilosc++;
            }
        }
        return ilosc;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            System.out.println("Maksymalna liczba to: " + ileMaksymalnych(list));
            System.out.println("Powtarza się ona : " + ilosc(list) + " razy");
        }
    }
}
