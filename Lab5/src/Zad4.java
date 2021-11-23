import java.util.ArrayList;
public class Zad4 {


    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer>result = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--)
        {
            result.add(a.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = reversed(a);
        for(Integer integer: result)
        {
            System.out.println(integer + " ");
        }


    }
}
