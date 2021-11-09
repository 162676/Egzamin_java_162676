import java.util.Scanner;
public class Zad1e {
    public static int countSubStr(String str,String subStr)
    {
        int ilosc = 0;
        int zmienna = 0;
        while(zmienna!=-1)  {

            zmienna = str.indexOf(subStr, zmienna);
            if(zmienna!=-1)
            {
                ilosc++;
                zmienna+=subStr.length();
            }
        }
        return ilosc;

    }
    public static int[] where(String str,String subStr)
    {
        int loop[] = new int[countSubStr(str,subStr)];
        int pozycja = 0;
        int zmienna_pomocnicza = 0;
        while(str.indexOf(subStr,zmienna_pomocnicza)!=-1)
        {
            loop[pozycja] = str.indexOf(subStr,zmienna_pomocnicza);
            zmienna_pomocnicza = str.indexOf(subStr,zmienna_pomocnicza)+1;
            pozycja++;
        }
        return loop;
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj Ciąg znaków, w którym wyszukam  ciąg znaków, ktory zaraz podasz i podam na jakich pozycjach występuje");
    String str = scanner.nextLine();
    System.out.println("Podaj ciąg znaków, który wuszkam");
    String subStr = scanner.nextLine();
    System.out.println("Podaje pozycje:  " + where(str,subStr));
    }
}
