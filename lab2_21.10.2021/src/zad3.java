public class zad3 {
    public static int[][] generuj(int n, int m, int minWartosc,int maxWartosc) {
        Random generator = new Random();
        int[][] macierz = new int[n][m];
        for(int i=0; i<n;i++)
        {
            for( int j =0; j<m; j++){
                macierz[i][j] =  generator.nextInt (maxWartosc+1+maxWartosc)+minWartosc;
            }
        }
        return macierz;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int m = scan.nextInt ();
        int n = scan.nextInt ();
        int k = scan.nextInt ();

        if(n>=1&&n<=10 && m>=1 && m<=10 && k>=1 && k<=10)
        {
            int[][] macierzA = generuj(m,n,-999,999);
            int[][] macierzB = generuj(n,k,-999,999);
            int[][] macierzC = new int[m][k];
            for(int i=0;i<m;i++){
                for(int j=0;j<k;j++){
                    int subSum = 0;
                    for(int q=0;q<n;q++){
                        subSum += macierzA[i,q]*macierzB[q,j];
                    }
                    macierzC[i][j]=subSum;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<k;j++){
                    System.out.print(macierzC[i][j]);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }

        }
        else
        {
            System.out.println("Podana liczba nie mieści się w zakresie podanym w zadaniu");
        }
    }
}

