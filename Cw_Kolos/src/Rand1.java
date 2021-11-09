import java.util.Scanner;
import java.util.Random;
public class Rand1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz czytać: ");
        int n = scanner.nextInt();
        int Parz = 0;
        int Nieparz=0;
        if(n>=1 && n<=99)
        {
            int tab[] = new int[n];
            Random losowa = new Random();
            for(int i=0;i<n;i++)
            {
                tab[i] = losowa.nextInt(1999)-999;
                System.out.println(tab[i]);
                if(tab[i]%2==0)
                {
                    Parz++;
                }
                else
                {
                    Nieparz++;
                }
            }
        }
        System.out.println("Parzystych jest: "+ Parz);
        System.out.println("Niearzystych jest: "+ Nieparz);
    }
}
