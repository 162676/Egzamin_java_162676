import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Zad2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb, które zamierzasz wpisać");
        int n = scanner.nextInt();
        int suma = 0;
        for(int i=0;i<n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            int z = scan.nextInt();
            if(sqrt(z)%2==0)
            {
                suma+=1;
            }
        }
        System.out.println(suma);
    }
}
