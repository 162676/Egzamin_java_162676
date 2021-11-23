import java.util.ArrayList;
public class Zad1 {

        public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
        {
          ArrayList<Integer>result = new ArrayList<Integer>();
          result.addAll(a);
          result.addAll(b);
          return result;
        }
        public static void main(String[] args) {

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

            ArrayList<Integer> result = new ArrayList<Integer>();
            result = append(a,b);
            for(Integer item: result)
            {
                System.out.println(item + " ");
            }


        }
}
