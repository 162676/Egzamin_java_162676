import java.util.*;
public class Z2 {
    public static <E>void printMariginal(Iterable<E>element)
    {
        final Iterator<E>itr = element.iterator();
        E nextElement = itr.next();
        System.out.println(nextElement);
        while(itr.hasNext())
        {
            nextElement = itr.next();
        }
        System.out.println(nextElement);
    }

    public static void main(String[] args) {
        List<Integer>ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        Set<Character>chars = new HashSet<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');

        Vector<Double>doubles = new Vector<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);

        Queue<String> strings = new PriorityQueue<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add("dd");

        printMariginal(ints);
        printMariginal(chars);
        printMariginal(doubles);
        printMariginal(strings);



    }
}
