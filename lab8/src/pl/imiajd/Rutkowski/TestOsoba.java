package pl.imiajd.Rutkowski;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Norbert","Rutkowski", LocalDate.of(2000,12,13),true);
        Student student = new Pracownik("Norbert","Rutkowski", LocalDate.of(2000,12,13),true);
        student.getSredniaOcen(4.5);

        System.out.println(pracownik.toString());
        System.out.println(student.toString());
        //Niestety nie wiem z czego wynikają błedy  próbowałem imiona jako new string[] zapisac i nie działało :/
    }
}
