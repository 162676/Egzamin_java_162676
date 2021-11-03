import java.util.Scanner;

public class Zad2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        double tab[] = new double[n];
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int z = scan.nextInt();
            tab[i] = z;
        }
        for(int i=0;i<n;i++)
        {
            if(tab[i]>0 && tab[i+1]>0)
            {
                System.out.println("("+tab[i] + "," + tab[i+1] + ")");
            }
        }
    }
}
