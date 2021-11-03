import java.util.Scanner;

public class Zad1b {

    public static int countSubStr(String str, String subStr) {
      int li=0;
      int wynik=0;
      while(li!=-1)
      {
          li= str.indexOf(subStr,li);
          if(li!=-1)
          {
              wynik++;
              li+=subStr.length();
          }
      }
      return wynik;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolne slowo: ");
        System.out.print("> ");
        String str = scan.nextLine();
        System.out.println("Podaj slowo, ktorego szukasz: ");
        System.out.print("> ");
        String subStr = scan.nextLine();
        System.out.println("Liczba powtórzeń slowa " + subStr + " wynosi: " + countSubStr(str, subStr));
    }
}
