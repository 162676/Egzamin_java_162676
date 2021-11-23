import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Zad2 {
    public static ArrayList <Integer> merge(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList <Integer>result = new ArrayList();
        int aLength = a.size();
        int bLength = b.size();
        int rozmiar = Math.max(a.size(),b.size());
        for(int i=0;i<rozmiar;i++)
        {
            if(i<aLength)
            {
                result.add(a.get(i));
            }
            if(i<bLength)
            {
                result.add(b.get(i));
            }
        }
        return result;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList <Integer> a, ArrayList <Integer> b)
    {
        ArrayList<Integer>result = merge(a,b);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);


        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(4);
        c.add(9);
        c.add(16);

        ArrayList<Integer> d = new ArrayList<Integer>();
        d.add(4);
        d.add(7);
        d.add(9);
        d.add(9);
        d.add(11);


        ArrayList<Integer> result = new ArrayList<Integer>();
        result = merge(a,b);
        for(Integer item: result)
        {
            System.out.println(item + " ");
        }
        result = mergeSorted(c,d);
        for(Integer item: result)
        {
            System.out.println(item + " 2 metoda");
        }
    }
}
