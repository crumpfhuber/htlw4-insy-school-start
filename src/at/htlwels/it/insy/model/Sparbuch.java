package at.htlwels.it.insy.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Sparbuch")
public class Sparbuch extends Produkt {

    private float zinsSatz;
    private double  aktuellerSparSaldo;
    private int sperrdauerInMonaten;

    public Sparbuch() {
    }

    public float getZinsSatz() {
        return zinsSatz;
    }

    public void setZinsSatz(float zinsSatz) {
        this.zinsSatz = zinsSatz;
    }

    public double getAktuellerSparSaldo() {
        return aktuellerSparSaldo;
    }

    public void setAktuellerSparSaldo(double aktuellerSparSaldo) {
        this.aktuellerSparSaldo = aktuellerSparSaldo;
    }

    public int getSperrdauerInMonaten() {
        return sperrdauerInMonaten;
    }

    public void setSperrdauerInMonaten(int sperrdauerInMonaten) {
        this.sperrdauerInMonaten = sperrdauerInMonaten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sparbuch sparbuch = (Sparbuch) o;

        if (Float.compare(sparbuch.zinsSatz, zinsSatz) != 0) return false;
        if (Double.compare(sparbuch.aktuellerSparSaldo, aktuellerSparSaldo) != 0) return false;
        return sperrdauerInMonaten == sparbuch.sperrdauerInMonaten;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (zinsSatz != +0.0f ? Float.floatToIntBits(zinsSatz) : 0);
        temp = Double.doubleToLongBits(aktuellerSparSaldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + sperrdauerInMonaten;
        return result;
    }

    @Override
    public String toString() {
        return "Sparbuch{" +
                "zinsSatz=" + zinsSatz +
                ", aktuellerSparSaldo=" + aktuellerSparSaldo +
                ", sperrdauerInMonaten=" + sperrdauerInMonaten +
                '}';
    }
}
