import java.util.Random;
import java.util.Scanner;

public class zad2_f {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static void signum(int list[])
    {
        int [] listOne  = new int[list.length];
        for(int i=0;i< list.length;i++)
        {
            if(list[i]>0)
            {
                list[i] = 1;
            }
            else
            {
                list[i]=-1;
            }
        }
        System.out.println("Zmodyfikowana lista");
        for(int i=0;i< list.length;i++)
        {
            System.out.print(list[i] + "\n");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            signum(list);
        }
    }
}
