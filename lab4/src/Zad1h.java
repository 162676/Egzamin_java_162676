import java.util.Scanner;
    public class Zad1h {
        public static String nice(String str,char znak,int n)
        {
            StringBuffer strBuffer = new StringBuffer();
            int zmienna=1;
            for(int i=str.length()-1;i>=0;i--)
            {
                strBuffer.append(str.charAt(i));
                if(zmienna==n)
                {
                    strBuffer.append(znak);
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
            System.out.println("Podaj jakim znakiem chcesz oddzielić liczbe");
            char znak = scanner.next().charAt(0);
            System.out.println("Podaj odstęp pomiędzy, którym wstawie wyżej podany znak");
            int n = scanner.nextInt();
            System.out.println("Oto twój wynik: " + nice(zmienna,znak,n));
        }
    }
