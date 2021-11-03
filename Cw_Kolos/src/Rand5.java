import java.util.Random;
import java.util.Scanner;

public class Rand5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb, z które chcesz wylosować");
        int n = scan.nextInt ();
        int left = scan.nextInt();
        int right = scan.nextInt();

        if(left>right){
            int help = left;
            left = right;
            right = help;
        }
        if(n>=0&&n<=100 && left>=1 && left<n && right>=1 && right<n )
        {
            int[] list = new int[n];
            Random generator = new Random();
            for(int i=0; i<n;i++)
            {
                list[i] = generator.nextInt (1999)-999;
            }

            while(left<right){
                int help2 = list[left];
                list[left] = list[right];
                list [right] = left;
                right--;
                left++;
            }

        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}


