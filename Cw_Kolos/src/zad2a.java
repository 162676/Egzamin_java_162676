import java.util.Scanner;
public class zad2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wczytać");
        int n = scan.nextInt();
        int drugie = 0;
        for(int i=0;i<n;i++)
        {
            Scanner Scan = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            int z = Scan.nextInt();
            if(z%2!=0)
            {
                drugie+=1;
            }
        }
        System.out.println("Liczb nieparzystych jest " + drugie);
    }
}
