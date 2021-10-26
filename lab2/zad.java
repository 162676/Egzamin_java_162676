import java.util.Random;
import java.util.Scanner;

public class zad {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, które chcesz dodać");
        int n = scan.nextInt ();
        if(n>=0&&n<=100)
        {
            int[] list = new int[n];
            Random generator = new Random();
            for(int i=0; i<n;i++)
            {
                list[i] = generator.nextInt (999+999)-999;
                for(int j=0;j<n;j++)
                {
                    System.out.println(list[j]);
                }
            }

        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}
