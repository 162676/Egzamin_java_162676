package pl.imiajd.Rutkowski;
import java.time.LocalDate;
public class Osoba {

    private String nazwisko;
    private LocalDate rokUrodzenia;
    private String[] imiona;
    private boolean plec;

    public Osoba(String[] imiona,String nazwisko, LocalDate rokUrodzenia, boolean plec) {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
    }
    public String[] getImie()
    {
        return this.imiona;
    }
    public String getNazwisko()
    {
        return this.nazwisko;
    }
    public LocalDate getRok()
    {
        return this.rokUrodzenia;
    }
    public boolean getPlec()
    {
        return this.plec;
    }

}
