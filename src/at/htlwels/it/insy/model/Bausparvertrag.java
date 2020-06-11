package at.htlwels.it.insy.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bausparvertrag")
public class Bausparvertrag extends Produkt {

    private double monatlicheRate;
    private double praemie;
    private int gesamteLaufzeitInMonaten;
    private float garanierterZinssatz;

    public Bausparvertrag() {
    }

    public double getMonatlicheRate() {
        return monatlicheRate;
    }

    public void setMonatlicheRate(double monatlicheRate) {
        this.monatlicheRate = monatlicheRate;
    }

    public double getPraemie() {
        return praemie;
    }

    public void setPraemie(double praemie) {
        this.praemie = praemie;
    }

    public int getGesamteLaufzeitInMonaten() {
        return gesamteLaufzeitInMonaten;
    }

    public void setGesamteLaufzeitInMonaten(int gesamteLaufzeitInMonaten) {
        this.gesamteLaufzeitInMonaten = gesamteLaufzeitInMonaten;
    }

    public float getGaranierterZinssatz() {
        return garanierterZinssatz;
    }

    public void setGaranierterZinssatz(float garanierterZinssatz) {
        this.garanierterZinssatz = garanierterZinssatz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bausparvertrag that = (Bausparvertrag) o;

        if (Double.compare(that.monatlicheRate, monatlicheRate) != 0) return false;
        if (Double.compare(that.praemie, praemie) != 0) return false;
        if (gesamteLaufzeitInMonaten != that.gesamteLaufzeitInMonaten) return false;
        return Float.compare(that.garanierterZinssatz, garanierterZinssatz) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(monatlicheRate);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(praemie);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + gesamteLaufzeitInMonaten;
        result = 31 * result + (garanierterZinssatz != +0.0f ? Float.floatToIntBits(garanierterZinssatz) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bausparvertrag{" +
                "monatlicheRate=" + monatlicheRate +
                ", praemie=" + praemie +
                ", gesamteLaufzeitInMonaten=" + gesamteLaufzeitInMonaten +
                ", garanierterZinssatz=" + garanierterZinssatz +
                '}';
    }
}
