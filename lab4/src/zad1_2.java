import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class zad1_2 {

    public static void main(String[] args) throws FileNotFoundException {
        int ile_liter = 0;
        char znak_z_napisu;
        try {
            File file = new File("plik.txt");
            boolean exists = file.exists();
            System.out.println("Czy istnieje: " + exists);
            Scanner scanner = new Scanner(file);
            if (exists != true) {
                PrintWriter writer = new PrintWriter(file);
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj literę, której ilość policze w pliku");
            char n = scan.next().charAt(0);
            /*while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }*/

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                System.out.println(str);
                for (int i = 0; i < str.length(); i++) {
                    znak_z_napisu = str.charAt(i);
                    if (znak_z_napisu == n) {
                        ile_liter++;
                    }
                }

            }
            scanner.close();
        } catch (FileNotFoundException x) {
            System.out.println("Error");
            x.printStackTrace();
        }
        System.out.println("Liczba liter to: " + ile_liter);
    }
}
