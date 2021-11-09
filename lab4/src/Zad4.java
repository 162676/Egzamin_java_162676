import java.math.BigInteger;
import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiar tablicy, wymiar ten zostanie przypisany do poziomu jak i pionu tablicy");
        int n = scanner.nextInt();

        BigInteger ziarno = new BigInteger("1");
        BigInteger count = new BigInteger("0");
        BigInteger [][]tab = new BigInteger[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                tab[i][j] = ziarno;
                count = count.add(ziarno);
                ziarno = ziarno.multiply(new BigInteger("2"));
            }
            System.out.println("Ile ziaren maku położymy na szachownicy: " + count );
        }



    }
}
