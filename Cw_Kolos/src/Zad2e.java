import java.util.Scanner;
import static java.lang.Math.pow;
public class Zad2e {
    public static int silnia(int n)
    {
        int wynik = 1;
        for(int i=1;i<=n;i++)
        {
            wynik*=i;
        }
        return wynik;
    }
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ile chcesz liczb sprawdzić pajacu");
      int n = scanner.nextInt();
      double tab[] = new double[n];
      double wynik = 0;
      for(int i=0;i<n;i++)
      {
          Scanner scan = new Scanner(System.in);
          System.out.println("Podaj liczbe kmiocie");
          double a = scanner.nextDouble();
          tab[i] = a;
      }
      for(int i=0;i<n;i++)
      {
          if(pow(2,i)<tab[i] && tab[i]<silnia(i))
          {
              wynik++;
          }
      }
      System.out.println(wynik);
    }
}
