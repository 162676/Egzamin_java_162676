import java.util.Scanner;

public class zad2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Podaj ilość liczb");
        int n = scan.nextInt ();
        double tab[] = new double[n];
        for (int i=0;i<n;i++)
        {
            Scanner scanner = new Scanner (System.in);
            System.out.println ("Podaj  liczby, które chcesz wypisać");
            double z = scan.nextDouble();
            tab[i] = z;
        }
        for(int i=1;i<tab.length;i++)
        {
            System.out.println(tab[i] + ", ");
        }
        System.out.println(tab[0]);
    }
}
