public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double zmienna)
    {
        saldo = zmienna;
    }
    public double obliczMiesieczneOdsetki()
    {
        double odsetki = (saldo*rocznaStopaProcentowa)/12;
        saldo = saldo + odsetki;
        return saldo;
    }
    public static void setRocznaStopaProcentowa(double NowaWartosc )
    {
       rocznaStopaProcentowa = NowaWartosc;
    }
    public double getSaldo()
    {
        return saldo;
    }

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
    }
}
