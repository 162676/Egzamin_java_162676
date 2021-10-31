import java.lang.String;
import java.util.Scanner;
public class Zad1a {
    public static int CountChar(String str, char c)
    {
       int ile_liter = 0;
       char znak_z_napisu;
       for(int i=0; i<str.length();i++)
       {
           znak_z_napisu = str.charAt(i);
           if(znak_z_napisu == c)
           {
               ile_liter++;
           }
       }
       return ile_liter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz, w którym chcesz wykryć ilość powtarzania się litery");
        String slowo = scanner.next();
        System.out.println("Podaj literę, sprawdzę ile razy występuje w podanym słowie");
        char n = scanner.next().charAt(0);
        System.out.println("Litera występuje w słowie: " + CountChar(slowo,n) + " razy" );

    }
}
