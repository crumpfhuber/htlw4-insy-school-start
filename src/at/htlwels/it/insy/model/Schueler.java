package at.htlwels.it.insy.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class Schueler extends Person {


    private Timestamp schulEintrittsDatum;
    private long schuelerIdentifikationsNummer;


    private Schulklasse schulKlasse;

    public Schueler() {
    }

    public Timestamp getSchulEintrittsDatum() {
        return schulEintrittsDatum;
    }

    public void setSchulEintrittsDatum(Timestamp schulEintrittsDatum) {
        this.schulEintrittsDatum = schulEintrittsDatum;
    }

    public long getSchuelerIdentifikationsNummer() {
        return schuelerIdentifikationsNummer;
    }

    public void setSchuelerIdentifikationsNummer(long schuelerIdentifikationsNummer) {
        this.schuelerIdentifikationsNummer = schuelerIdentifikationsNummer;
    }

    public Schulklasse getSchulKlasse() {
        return schulKlasse;
    }

    public void setSchulKlasse(Schulklasse schulKlasse) {
        this.schulKlasse = schulKlasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schueler)) return false;
        if (!super.equals(o)) return false;
        Schueler schueler = (Schueler) o;
        return getSchuelerIdentifikationsNummer() == schueler.getSchuelerIdentifikationsNummer() &&
                Objects.equals(getSchulEintrittsDatum(), schueler.getSchulEintrittsDatum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSchulEintrittsDatum(), getSchuelerIdentifikationsNummer());
    }

    @Override
    public String toString() {
        return "Schueler{" +
                "schulEintrittsDatum=" + schulEintrittsDatum +
                ", schuelerIdentifikationsNummer=" + schuelerIdentifikationsNummer +
                "} " + super.toString();
    }
}
