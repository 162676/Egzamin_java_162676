import java.util.Arrays;

public class zad7 {
    public static void main(String[] args) {
        int n=100;
        boolean pierwsze[] = new boolean[n];
        Arrays.fill(pierwsze, true);
        pierwsze[0]=false;
        pierwsze[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            for(int t=i+i;t<n;t=t+i){

                pierwsze[t]=false;
            }
        }
        for(int j=0;j<n;j++){

            if(pierwsze[j])
                System.out.println(j);

        }

    }
}
