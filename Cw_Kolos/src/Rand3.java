import java.util.Scanner;
import java.util.Random;
public class Rand3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int ilosc = 0;
        if(n>=1 && n<=100)
        {
            int tab[] = new int[n];
            int max = tab[0];
            Random generator = new Random();
            for(int i=0;i<n;i++)
            {
                tab[i] = generator.nextInt(1999)-999;
                System.out.println(tab[i]);
            }
            for(int i=0;i<n;i++)
            {
                if(max<tab[i])
                {
                    max = tab[i];
                }
            }
            for(int i=0;i<n;i++)
            {
                if(tab[i]==max)
                {
                    ilosc++;
                }
            }
            System.out.println("Max wynosi: " + max + " Ilosc wynosi "+ ilosc);
        }
    }
}
