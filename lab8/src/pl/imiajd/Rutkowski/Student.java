package pl.imiajd.Rutkowski;
import java.time.LocalDate;

public class Student extends Osoba{
    private double sredniaOcen;

    public Student(String[] imie, String nazwisko, LocalDate rokUrodzenia, boolean plec, double sredniaOcen,String kierunek) {
        super(imie,nazwisko, rokUrodzenia,plec);
        this.sredniaOcen = sredniaOcen;
    }
    public void setSredniaOcen(double sredniaOcen)
    {

        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen()
    {

        return sredniaOcen;
    }
}
