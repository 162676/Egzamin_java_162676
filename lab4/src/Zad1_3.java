import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Zad1_3 {
    public static void main(String[] args) {
        int ilosc = 0;
        int zmienna = 0;
        try {
            File file = new File("plik1.txt");
            boolean exists = file.exists();
            System.out.println("Czy istnieje: " + exists);
            Scanner scanner = new Scanner(file);
            if (exists != true) {
                PrintWriter writer = new PrintWriter(file);
            }
            Scanner scan = new Scanner(System.in);

            System.out.println("Podaj ciag znaków, a wypiszę ile takich widzę w pliku");
            String subStr = scan.nextLine();
            while(scanner.hasNext()) {
                String pomocnicza = scanner.next();
                while (zmienna != -1) {

                    zmienna = pomocnicza.indexOf(subStr, zmienna);
                    if (zmienna != -1) {
                        ilosc++;
                        zmienna += subStr.length();
                    }
                }
            }

            /*while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }*/




            scanner.close();
        } catch (FileNotFoundException x) {
            System.out.println("Error");
            x.printStackTrace();
        }
        System.out.println("Podany ciąg znaków występuje w pliku: "+ ilosc  + " razy" );
    }
}
