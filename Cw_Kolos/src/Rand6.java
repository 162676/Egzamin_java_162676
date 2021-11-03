import java.util.Random;
import java.util.Scanner;
public class Rand6 {
    public static int[][] generuj(int n, int m, int minwartosc, int maxwartosc)
    {
        Random generator = new Random();
        int macierz[][] = new int[n][m];
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                macierz[i][j] = generator.nextInt(maxwartosc+maxwartosc+1)+minwartosc;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println(macierz[i][j]);
                System.out.println(" ");
            }
            System.out.print("\n");
        }
        System.out.println();
        return macierz;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n >= 1 && n <= 10 && m >= 1 && m <= 10 && k >= 1 && k <= 10) {
            int MacierzA[][] = generuj(m, n, -999, 999);
            int MacierzB[][] = generuj(m, n, -999, 999);
            int MacierzC[][] = new int[m][k];
            for (int i = 0; i < m; i++) {
                for (int j = 0; i < k; i++) {
                    int subsum = 0;
                    for (int g = 0; g < n; g++) {
                        subsum += MacierzA[i][g] * MacierzB[g][j];
                    }
                    MacierzC[i][j] = subsum;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<k;j++){
                    System.out.print(MacierzC[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
            }
        }

