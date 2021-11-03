import java.util.Scanner;
public class Zad2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz liczb wpisać");
        int n = scanner.nextInt();
        int wynik = 0;
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int z = scan.nextInt();
            if(z%3==0 && z%5!=0)
            {
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
}
