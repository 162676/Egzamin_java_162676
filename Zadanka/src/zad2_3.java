import java.util.Scanner;

public class zad2_3 {
    public static void main(String[] args) {
        System.out.println("ZADANIE 2 3");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb, z których wybiorę dodanie,ujemne oraz podam ilość zer");
        int drugie3 = scan.nextInt();
        float plusy = 0;
        float minusy = 0;
        float liczbaZer = 0;
        for (int i = 1; i <= drugie3; i++) {
            Scanner scane = new Scanner(System.in);
            System.out.println("Podaj liczby, które chcesz sprawdzic czy są dodatnie, ujemne oraz ile zer podałeś");
            int liczbydrugie = scan.nextInt();
            if (liczbydrugie > 0) {

                plusy += 1;
            } else if (liczbydrugie == 0) {
                liczbaZer += 1;
            } else {
                minusy += 1;
            }
        }
        System.out.println("Liczb dodatnich jest: " + plusy);
        System.out.println("Liczb ujemnych jest: " + minusy);
        System.out.println("Zer jest: " + liczbaZer);
    }
}
