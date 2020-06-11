package at.htlwels.it.insy.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Kredit")
public class Kredit extends Produkt {

    private double basisKreditBetrag;
    private double aktuellerSaldo;
    private float aktuellerZinsSatz;
    private int ausstehendeTilgungen;

    public Kredit() {
    }

    public double getBasisKreditBetrag() {
        return basisKreditBetrag;
    }

    public void setBasisKreditBetrag(double basisKreditBetrag) {
        this.basisKreditBetrag = basisKreditBetrag;
    }

    public double getAktuellerSaldo() {
        return aktuellerSaldo;
    }

    public void setAktuellerSaldo(double aktuellerSaldo) {
        this.aktuellerSaldo = aktuellerSaldo;
    }

    public float getAktuellerZinsSatz() {
        return aktuellerZinsSatz;
    }

    public void setAktuellerZinsSatz(float aktuellerZinsSatz) {
        this.aktuellerZinsSatz = aktuellerZinsSatz;
    }

    public int getAusstehendeTilgungen() {
        return ausstehendeTilgungen;
    }

    public void setAusstehendeTilgungen(int ausstehendeTilgungen) {
        this.ausstehendeTilgungen = ausstehendeTilgungen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kredit kredit = (Kredit) o;

        if (Double.compare(kredit.basisKreditBetrag, basisKreditBetrag) != 0) return false;
        if (Double.compare(kredit.aktuellerSaldo, aktuellerSaldo) != 0) return false;
        if (Float.compare(kredit.aktuellerZinsSatz, aktuellerZinsSatz) != 0) return false;
        return ausstehendeTilgungen == kredit.ausstehendeTilgungen;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(basisKreditBetrag);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(aktuellerSaldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (aktuellerZinsSatz != +0.0f ? Float.floatToIntBits(aktuellerZinsSatz) : 0);
        result = 31 * result + ausstehendeTilgungen;
        return result;
    }

    @Override
    public String toString() {
        return "Kredit{" +
                "basisKreditBetrag=" + basisKreditBetrag +
                ", aktuellerSaldo=" + aktuellerSaldo +
                ", aktuellerZinsSatz=" + aktuellerZinsSatz +
                ", ausstehendeTilgungen=" + ausstehendeTilgungen +
                '}';
    }
}
