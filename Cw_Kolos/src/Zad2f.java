import java.util.Scanner;
public class Zad2f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, które chcesz wczytać");
        int n = scanner.nextInt();
        int wynik = 0;
        for(int i=1;i<n+1;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int z = scan.nextInt();
            if(i%2!=0 && z%2==0)
            {
                System.out.println(i + ". " + z);
                wynik++;
            }
        }
        System.out.println("Wynik wygląda następująco: " + wynik);
    }
}
