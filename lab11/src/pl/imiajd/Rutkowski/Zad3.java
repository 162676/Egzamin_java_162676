package pl.imiajd.Rutkowski;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
public class Zad3 {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab) {
        ArrayList<T> VariableArray = new ArrayList<>(tab);
        Collections.sort(VariableArray);
        return tab.equals(VariableArray);
    }

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(9);
        liczby.add(2);
        liczby.add(5);
        liczby.add(6);
        System.out.println(isSorted(liczby));
        Collections.sort(liczby);
        System.out.println("Liczby posortowane: " + liczby);
        System.out.println(isSorted(liczby));

    }
}
