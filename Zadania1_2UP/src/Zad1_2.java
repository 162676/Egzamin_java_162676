import java.io.File;
import java.util.Scanner;
import java.io.*;
public class Zad1_2 {

    public static void main(String[] args) {
        File file = new File("plik.txt");
        boolean exists = file.exists();
        System.out.println("Czy istnieje: " + exists);
        Scanner scanner = new Scanner(file);
    }
}
