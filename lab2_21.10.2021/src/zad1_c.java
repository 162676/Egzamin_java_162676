import java.util.Random;
import java.util.Scanner;

public class zad1_c {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, z które chcesz wylosować");
        int n = scan.nextInt ();
        int ilosc = 0;
        if(n>=0&&n<=100)
        {
            int[] list = new int[n];
            Random generator = new Random();
            int max=list[0];
            for(int i=0; i<n;i++)
            {
                list[i] = generator.nextInt (1999)-999;
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(list[i]);
                if(list[i]>max)
                {
                    max=list[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(list[i]==max)
                {
                    ilosc++;
                }
            }
            System.out.println("Największą liczbą jest: "+ max);
            System.out.println("Największa liczba została wylosowana "+ ilosc + " razy");



        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}
