import java.util.Scanner;

public class zad1_2 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1.2");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosć liczb");
        int JedenDwa = scan.nextInt();
        double[] liczby12 = new double[JedenDwa];
        for (int i = 0; i < JedenDwa; i++) {
            System.out.println("Podaj liczby ");
            double a = scan.nextDouble();
            liczby12[i] = a;
        }
        System.out.print("\n Wyspisuje podane przez Ciebie liczy wedle zadania:  ");
        for (int i = 1; i < JedenDwa; i++) {

            System.out.print(liczby12[i] + ", ");
        }
        System.out.print(liczby12[0]);
    }
}
