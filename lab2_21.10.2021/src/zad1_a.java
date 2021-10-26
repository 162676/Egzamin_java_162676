import java.util.Random;
import java.util.Scanner;

public class zad1_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, z które chcesz wylosować");
        int n = scan.nextInt ();
        int empty_parzyste=0;
        int empty_nieparzyste=0;
        if(n>=0&&n<=100)
        {
            int[] list = new int[n];
            Random generator = new Random();
            for(int i=0; i<n;i++)
            {
                list[i] = generator.nextInt (1999)-999;
            }
            for(int i=0;i<n;i++)
            {
                if(list[i]%2==0)
                {
                    empty_parzyste+=1;
                }
                else
                {
                    empty_nieparzyste+=1;
                }
            }
            System.out.println("Liczb parzystych jest: "+ empty_parzyste);
            System.out.println("Liczb nieparzystych jest: "+ empty_nieparzyste);

        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}
