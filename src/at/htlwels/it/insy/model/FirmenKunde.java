package at.htlwels.it.insy.model;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class FirmenKunde extends Kunde {

    private String firmenLangbezeichung;
    private String firmenKuerzel;
    private Date gruendungsDatum;
    private String gruendungsOrt;
    private String gesellschaftsForm;

    public FirmenKunde() {
    }

    public String getFirmenLangbezeichung() {
        return firmenLangbezeichung;
    }

    public void setFirmenLangbezeichung(String firmenLangbezeichung) {
        this.firmenLangbezeichung = firmenLangbezeichung;
    }

    public String getFirmenKuerzel() {
        return firmenKuerzel;
    }

    public void setFirmenKuerzel(String firmenKuerzel) {
        this.firmenKuerzel = firmenKuerzel;
    }

    public Date getGruendungsDatum() {
        return gruendungsDatum;
    }

    public void setGruendungsDatum(Date gruendungsDatum) {
        this.gruendungsDatum = gruendungsDatum;
    }

    public String getGruendungsOrt() {
        return gruendungsOrt;
    }

    public void setGruendungsOrt(String gruendungsOrt) {
        this.gruendungsOrt = gruendungsOrt;
    }

    public String getGesellschaftsForm() {
        return gesellschaftsForm;
    }

    public void setGesellschaftsForm(String gesellschaftsForm) {
        this.gesellschaftsForm = gesellschaftsForm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FirmenKunde that = (FirmenKunde) o;

        if (firmenLangbezeichung != null ? !firmenLangbezeichung.equals(that.firmenLangbezeichung) : that.firmenLangbezeichung != null)
            return false;
        if (firmenKuerzel != null ? !firmenKuerzel.equals(that.firmenKuerzel) : that.firmenKuerzel != null)
            return false;
        if (gruendungsDatum != null ? !gruendungsDatum.equals(that.gruendungsDatum) : that.gruendungsDatum != null)
            return false;
        if (gruendungsOrt != null ? !gruendungsOrt.equals(that.gruendungsOrt) : that.gruendungsOrt != null)
            return false;
        return gesellschaftsForm != null ? gesellschaftsForm.equals(that.gesellschaftsForm) : that.gesellschaftsForm == null;
    }

    @Override
    public int hashCode() {
        int result = firmenLangbezeichung != null ? firmenLangbezeichung.hashCode() : 0;
        result = 31 * result + (firmenKuerzel != null ? firmenKuerzel.hashCode() : 0);
        result = 31 * result + (gruendungsDatum != null ? gruendungsDatum.hashCode() : 0);
        result = 31 * result + (gruendungsOrt != null ? gruendungsOrt.hashCode() : 0);
        result = 31 * result + (gesellschaftsForm != null ? gesellschaftsForm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrivatKunde{" +
                "firmenLangbezeichung='" + firmenLangbezeichung + '\'' +
                ", firmenKuerzel='" + firmenKuerzel + '\'' +
                ", gruendungsDatum=" + gruendungsDatum +
                ", gruendungsOrt='" + gruendungsOrt + '\'' +
                ", gesellschaftsForm='" + gesellschaftsForm + '\'' +
                '}';
    }
}
