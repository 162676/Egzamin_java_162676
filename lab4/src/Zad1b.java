import java.util.Scanner;

public class Zad1b {
    public static  int countSubStr(String str, String subStr) {
        int iloscWyrazu = 0;
        str = str.trim();
        if (str.contains(subStr)) {
        iloscWyrazu += 1;
        }
        return iloscWyrazu;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo bądz ciąg słów, który mam przeszukać");
        String Ciag = scanner.next();
        System.out.println("Powiedz słowo, którego ilość chcesz sprawdzić w podanym wyżej ciągu słów/słowie");
        Scanner scan= new Scanner(System.in);
        String slowo = scan.next();
        System.out.println("Słowo występuje w słowie/Ciągu słów: " + countSubStr(Ciag,slowo) + " razy" );
    }
}
