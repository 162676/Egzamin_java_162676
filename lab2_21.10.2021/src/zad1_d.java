import java.util.Random;
import java.util.Scanner;

public class zad1_d {
    public static void main(String[] args) {

                Scanner scan = new Scanner (System.in);
                System.out.println ("Podaj ilość liczb, z które chcesz wylosować");
                int n = scan.nextInt ();
                int ilosc = 0;
                int sumaDodawania=0;
                int sumaOdejmowania=0;
                if(n>=0&&n<=100)
                {
                    int[] list = new int[n];
                    Random generator = new Random();
                    for(int i=0; i<n;i++)
                    {
                        list[i] = generator.nextInt (1999)-999;
                    }
                    for(int i=0;i<n;i++)
                    {
                        System.out.println(list[i]);
                        if(list[i]>0)
                        {
                            sumaDodawania+=list[i];
                        }
                        else
                        {
                            sumaOdejmowania+=list[i];
                        }
                    }
                    System.out.println("Suma liczb dodatnich wynosi " + sumaDodawania);
                    System.out.println("Suma liczb ujemnych wynosi " + sumaOdejmowania);




                }
                else
                {
                    System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
                }
            }
        }

