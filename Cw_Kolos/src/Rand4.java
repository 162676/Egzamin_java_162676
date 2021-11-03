import java.util.Scanner;
import java.util.Random;
public class Rand4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int lenght = 0;
        int max_lenght = 0;
        if(n>=1 && n<=100)
        {
            Random generator = new Random();
            int list[] = new int[n];
            for(int i=0;i<n;i++)
            {
                list[i] = generator.nextInt(1999)-999;
                System.out.println(list[i]);
            }
            for(int i=0;i<n;i++)
            {
                if(list[i]>0)
                {
                    lenght++;
                }
                else if(list[i]<=0)
                {
                    if(max_lenght<lenght)
                    {
                        max_lenght=lenght;
                    }
                    lenght = 0;
                }
            }
            if(max_lenght<lenght)
            {
                max_lenght=lenght;
            }
            System.out.println("Najdluzszy ciag wynosi: " + max_lenght);
        }
    }
}
