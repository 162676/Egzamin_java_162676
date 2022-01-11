import java.util.LinkedList;
public class Zad3AND4 {
        public static <T> void odwroc(LinkedList<T> lista) {
            LinkedList<T> zmienna_pomocnicza = new LinkedList<>(lista);
            for (int i = lista.size() - 1, j = 0; i >= 0; i--, j++) {
                lista.set(j, zmienna_pomocnicza.get(i));
            }
        }

        public static void main(String[] args) {
            LinkedList<String>pracownicy1=new LinkedList<>();
            pracownicy1.add("Norbert");
            pracownicy1.add("Adrian");
            pracownicy1.add("Zosia");
            System.out.println(pracownicy1);
            odwroc(pracownicy1);
            System.out.println(pracownicy1);
        }
    }
