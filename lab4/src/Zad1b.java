import java.util.Scanner;

public class Zad1b {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj napis, w którym znajdę ilość dowolnego ciągu wyrazów jaki podasz:");
        String napis = scanner.nextLine();
        System.out.print("Podaj Ciąg znaków, któego ilość mam przeszukać:");
        String CiagZnakow = scanner.nextLine();
        System.out.print("Ciag znakow wystepuje w wyrażeniu:" + countSubStr(napis, CiagZnakow) + " razy.");
    }
}
