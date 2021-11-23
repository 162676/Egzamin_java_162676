import java.util.ArrayList;

public class Zad5 {
    public static void reverse(ArrayList<Integer> a)
    {
        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.println(a.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> result = new ArrayList<Integer>();
        reverse(a);
        for(Integer integer: a)
        {
            System.out.println(integer + " ");
        }
    }

}
