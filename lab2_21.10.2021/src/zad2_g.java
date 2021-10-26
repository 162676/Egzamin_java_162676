import java.util.Random;
import java.util.Scanner;

public class zad2_g {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static void odwrocFragment(int list[], int lewy, int prawy)
    {
        if(lewy>prawy){
            int help = lewy;
            lewy = prawy;
            prawy = help;
        }
        if(list.length>=0&&list.length<=100 && lewy>=1 && lewy< list.length && prawy>=1 && prawy< list.length )
        {

            while(lewy<prawy){
                int help2 = list[lewy];
                list[lewy] = list[prawy];
                list [prawy] = lewy;
                prawy--;
                lewy++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            odwrocFragment(list,5,7);
        }
    }
}
