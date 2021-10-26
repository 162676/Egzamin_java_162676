import java.util.Random;
import java.util.Scanner;

public class zad2_b {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static int ileDodatnich(int []list)
    {
        int iledodatnie = 0;
        for(int i=0;i< list.length;i++) {
            if (list[i] > 0) {
                iledodatnie += 1;
            }
        }
        return iledodatnie;
    }
    public static int ileUjemnych(int []list)
    {
        int ileujemne = 0;
        for(int i=0;i< list.length;i++) {
            if (list[i] < 0) {
                ileujemne += 1;
            }
        }
        return ileujemne;
    }
    public static int ileZerowych(int []list)
    {
        int ilezerowe = 0;
        for(int i=0;i< list.length;i++) {
            if (list[i] == 0) {
                ilezerowe += 1;
            }
        }
        return ilezerowe;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            System.out.println("Ilość dodatnich: " + ileDodatnich(list) + " Ilość ujemnych: " + ileUjemnych(list) + " ilość zerowych: "+ileZerowych(list) );
        }
    }
}
