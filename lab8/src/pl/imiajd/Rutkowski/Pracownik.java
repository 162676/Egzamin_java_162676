package pl.imiajd.Rutkowski;
import java.time.LocalDate;

public class Pracownik extends Osoba{
    private LocalDate dataZatrudnienia;

    public Pracownik(String[] imie, String nazwisko,LocalDate rokUrodzenia,boolean plec,LocalDate dataZatrudnienia) {
        super(imie,nazwisko, rokUrodzenia,plec);
        this.dataZatrudnienia = dataZatrudnienia;
    }
    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }
}
