package pl.imiajd.Rutkowski;

import java.time.LocalDate;

public abstract class Instrument  {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    abstract void dzwiek();

    public String toString() {
        return this.producent + "  " + this.rokProdukcji;
    }

}
