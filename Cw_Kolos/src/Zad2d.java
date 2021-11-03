import java.util.Scanner;
public class Zad2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcez podać");
        int n = scanner.nextInt();
        double tab[] = new double[n];
        int zmienna = 0;
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczby");
            double a = scan.nextDouble();
            tab[i] = a;
        }
        for(int i=0;i<n;i++)
        {
            if(((tab[i-1]+tab[i+1])/2)>tab[i])
            {
                zmienna+=1;
            }
        }
        System.out.println("Twój wymarzony wynik wynosi: " + zmienna + "Czarodzieju kochany");
    }
}
