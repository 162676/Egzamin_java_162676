package pl.imiajd.Rutkowski;

public class Adres {
    private static String ulica;
    private static String numer_domu;
    private static String numer_mieszkania;
    private static String miasto;
    private static String kod_pocztowy;

    public Adres(String Ul, String Nr_domu, String Nr_mieszkania, String city, String kod) {
        Adres.ulica = Ul;
        Adres.numer_domu = Nr_domu;
        Adres.numer_mieszkania = Nr_mieszkania;
        Adres.miasto = city;
        Adres.kod_pocztowy = kod;
    }
    public Adres(String Ul, String Nr_domu, String miejscowosc, String kod){
        ulica=Ul;
        numer_domu=Nr_domu;
        miasto=miejscowosc;
        kod_pocztowy=kod;
    }
    private void pokaz(){
        System.out.println("Kod pocztowy: "+ kod_pocztowy + " Miasto: " + miasto);
        if(numer_mieszkania != null)
            System.out.println("Ulica: " + ulica + " Nr_domu: " + numer_domu + " /" + numer_mieszkania);
        else
            System.out.println(ulica + " " + numer_domu);
    }

    private static boolean przed(Adres one, Adres two){
        if(one.kod_pocztowy.equals( two.kod_pocztowy))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Adres AdresOlsztyn = new Adres("Popiełuszki","18","8","Olsztyn","10-693");
        Adres AdresCzeladz = new Adres("Asnyka","11","Czeladz","41-253");
        AdresOlsztyn.pokaz();
        AdresCzeladz.pokaz();
        System.out.println(przed(AdresOlsztyn,AdresCzeladz));
    }

}
