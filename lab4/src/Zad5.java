import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
public class Zad5 {
    static BigDecimal wielkoscKapitalu(BigDecimal k, double n,int p)
    {
        for(int i = 0; i < p; i++)
        {
            k = k.add(k.multiply(BigDecimal.valueOf(n/100)));
        }
        MathContext x = new MathContext(5);
        return k.round(x);
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj Kapitał drogi użytkowniku");
      BigDecimal k = scanner.nextBigDecimal();
      System.out.print("Podaj długość okresu oszczędzenia (w latach):");
      int n = scanner.nextInt();
      System.out.print("Podaj stopę procentową:");
      double p = scanner.nextDouble();
      System.out.println("Wielkosc kapitału wynosi: "+ wielkoscKapitalu(k,p,n));


    }
}
