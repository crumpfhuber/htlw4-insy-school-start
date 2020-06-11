package at.htlwels.it.insy.model;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class PrivatKunde extends Kunde {

    private String vorName;
    private String familienName;
    private Date geburtsDatum;
    private String geburtsOrt;

    public PrivatKunde() {
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getFamilienName() {
        return familienName;
    }

    public void setFamilienName(String familienName) {
        this.familienName = familienName;
    }

    public Date getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Date geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getGeburtsOrt() {
        return geburtsOrt;
    }

    public void setGeburtsOrt(String geburtsOrt) {
        this.geburtsOrt = geburtsOrt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivatKunde that = (PrivatKunde) o;

        if (vorName != null ? !vorName.equals(that.vorName) : that.vorName != null) return false;
        if (familienName != null ? !familienName.equals(that.familienName) : that.familienName != null) return false;
        if (geburtsDatum != null ? !geburtsDatum.equals(that.geburtsDatum) : that.geburtsDatum != null) return false;
        return geburtsOrt != null ? geburtsOrt.equals(that.geburtsOrt) : that.geburtsOrt == null;
    }

    @Override
    public int hashCode() {
        int result = vorName != null ? vorName.hashCode() : 0;
        result = 31 * result + (familienName != null ? familienName.hashCode() : 0);
        result = 31 * result + (geburtsDatum != null ? geburtsDatum.hashCode() : 0);
        result = 31 * result + (geburtsOrt != null ? geburtsOrt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FirmenKunde{" +
                "vorName='" + vorName + '\'' +
                ", familienName='" + familienName + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", geburtsOrt='" + geburtsOrt + '\'' +
                '}';
    }
}
