import java.util.Random;
import java.util.Scanner;

public class zad2_e {
    public static void generuj(int []list, int n,int minWartosc,int maxWartosc) {
        Random generator = new Random();
        for(int i=0; i<n;i++)
        {
            list[i] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;

            System.out.println(list[i]);
        }
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int []list)
    {
        int lenght = 0;
        int max_lenght=0;
        for(int i=0;i< list.length;i++)
        {
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
        return max_lenght;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazów");
        int n = scanner.nextInt();
        int[] list = new int[n];
        if (n >= 1 && n <= 100) {
            generuj(list, n, -999, 999);
            System.out.println("Najdłuższy ciąg liczb dodatnich wynosi: " + dlugoscMaksymalnegoCiaguDodatnich(list));
        }
    }
}
