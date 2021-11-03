import java.util.Scanner;
import java.util.Random;
public class Rand2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int dodatnie = 0;
        int ujemne =0;
        int zerowe =0;
        if(n>=1 && n<=100)
        {
            int list[] = new int[n];
            Random generator = new Random();
            for(int i=0;i<n;i++)
            {
                list[i] = generator.nextInt(1999)-999;
                System.out.println(list[i]);
            }
            for(int i=0;i<n;i++)
            {

                if(list[i]>0)
                {
                    dodatnie++;
                }
                else if(list[i]<0)
                {
                    ujemne++;
                }
                else
                {
                    zerowe++;
                }
            }
            System.out.println("Dodatnie: "+ dodatnie + " Ujemne: "+ ujemne + " Zerowe: " + zerowe);

        }
    }
}
