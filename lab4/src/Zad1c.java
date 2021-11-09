import java.util.Scanner;
public class Zad1c {
    public static String Middle(String str) {
       int zmienna;
        int dlugosc;
        if(str.length()%2==0)
        {
            zmienna = str.length()/2-1;
            dlugosc=2;
        }
        else
        {
            zmienna = str.length()/2;
            dlugosc=1;
        }
        return str.substring(zmienna,zmienna+dlugosc);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo, któego wyznacze środek");
        String slowo = scan.nextLine();
        System.out.println("Srodkowa litera/badz 2 litery to: "+Middle(slowo));
    }
}
