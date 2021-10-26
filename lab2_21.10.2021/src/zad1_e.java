import java.util.Random;
import java.util.Scanner;

public class zad1_e {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, z które chcesz wylosować");
        int n = scan.nextInt ();
        int lenght = 0;
        int max_lenght=0;
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
                System.out.println(list[i]);
                if(list[i]>0)
                {
                    lenght++;
                }
                else if(list[i]<=0)
                {
                    if(max_lenght< lenght){
                        max_lenght=lenght;
                    }
                    lenght=0;
                }
            }
            if(max_lenght< lenght){
                max_lenght=lenght;
            }
            System.out.println("Najdluzszy ciag tablicy wynosi: "+ max_lenght);


        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}
