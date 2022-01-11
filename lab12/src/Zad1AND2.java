import java.util.LinkedList;
public class Zad1AND2 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        int zmienna_pomocnicza = n - 1;
        for (int i = zmienna_pomocnicza; i < pracownicy.size(); i += zmienna_pomocnicza) {
            pracownicy.remove(i);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> pracownicy1 = new LinkedList<>();
        pracownicy1.add("Norbert");
        pracownicy1.add("Adrian");
        pracownicy1.add("Zosia");
        System.out.println(pracownicy1);
        redukuj(pracownicy1,2);
        System.out.println(pracownicy1);
    }
}
