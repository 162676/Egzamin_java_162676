import java.util.Scanner;
public class Zad1g {
    public static String nice(String str)
    {
        StringBuffer strBuffer = new StringBuffer();
        int zmienna=1;
        for(int i=str.length()-1;i>=0;i--)
        {
            strBuffer.append(str.charAt(i));
            if(zmienna==3)
            {
                strBuffer.append(" \'");
                zmienna=0;
            }
            zmienna++;
        }
        strBuffer.reverse();
        return strBuffer.toString();
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę, w której postawię apostrof co 3 liczby ");
    String zmienna = scanner.nextLine();
    System.out.println("Oto twój wynik: " + nice(zmienna));
    }
}
