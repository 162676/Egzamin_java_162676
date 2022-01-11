import java.util.LinkedList;
import java.util.Stack;
public class Zad6 {
    /*
    Zadanie 6 trzeba szybko zrobić,
    Zanim zegar zdąży wskazówką do północy dobić,
    Zanim, wszelkie chęci do pracy znikną,
    Zanim zobaczę nadzieję na zrobienie nikłą,
    Zegar tyka coraz głośniej, głośniej i głośniej,
    Przypomina o pracy domowej najdonośniej,
    Ale ciężko się zabrać, brak myśli pomysłu,
    Brak jakiegoś konceptu zamysłu,
    Po chwili myślę... poddać się czy walczyć o więcej punktów,
    W tym celu muszę pokazać dużo pracy mej efektów,
    Więc do roboty lecimy z tymi zadnkami!
    By potem chwalić się chociaż 2 punktcikami!
     */
    public static void cyfry(int cyfra){
        Stack<Integer> cyfry = new Stack<>();
        while(cyfra!=0){
            cyfry.push(cyfra%10);
            cyfra/=10;
        }
        while(cyfry.size()>0){
            System.out.println(cyfry.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> cyfry = new LinkedList<>();
        cyfry.add(1);
        cyfry.add(2);
        cyfry.add(3);
    }
}
