import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int wynik = 0;
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int z = scan.nextInt();
            if(z>0)
            {
                System.out.println("Podwójna suma jest z liczb: " + 2*z);
                wynik+=2*z;
            }
        }
        System.out.println("Wynik to: " + wynik);
    }
}
