import java.util.Scanner;
import java.util.Random;
public class Rand1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int empty_parzyste=0;
        int empty_nieparzyste=0;
        if(n>=1 && n<=100)
        {
            int list[] = new int[n];
            Random generator=new Random();
            for(int i=0;i<n;i++)
            {
                list[i] = generator.nextInt(1999)-999;
                System.out.println(list[i]);
            }
            for(int i=0;i<n;i++)
            {
                if(list[i]%2==0)
                {
                    empty_parzyste++;
                }
                else
                {
                    empty_nieparzyste++;
                }
            }
        }
        System.out.println("Parzyste: " + empty_parzyste + " Nieparzyste: " + empty_nieparzyste);
    }
}
