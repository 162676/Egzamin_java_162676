import java.util.Scanner;

public class Zad2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int wynik = 0;
        int wynik1 = 0;
        int wynik2 = 0;
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ilość liczb, które chcesz wczytać");
            int z = scan.nextInt();
            if(z>0)
            {
                wynik+=1;
            }
            else if(z<0)
            {
                wynik1+=1;
            }
            else
            {
                wynik2+=1;
            }
        }
        System.out.println("Dodatnich jest: "+ wynik);
        System.out.println("ujemnych jest: "+ wynik1);
        System.out.println("Zerowych jest: "+ wynik2);
    }
}
