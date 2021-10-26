import java.util.Random;
import java.util.Scanner;
public class zad2_a {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static int ileParzystych(int list[]){
        int empty_parzyste = 0;
         for(int i=0;i<list.length;i++) {
             if (list[i] % 2 == 0) {
                 empty_parzyste += 1;
             }
         }
         return empty_parzyste;
    }
    public static int ileNieparzystych(int list[]){
        int empty_nieparzyste = 0;
        for(int i=0;i<list.length;i++) {
            if (list[i] % 2 != 0) {
                empty_nieparzyste += 1;
            }
        }
        return empty_nieparzyste;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if(n >= 1 && n <=100)
        {
            generuj(list, n, -999, 999);
            System.out.println("Ilość parzystych elementów wynosi: " + ileParzystych(list) + " Ilość elementów parzystych wynosi: " + ileNieparzystych(list) );
        }
    }
}
