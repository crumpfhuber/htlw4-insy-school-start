package at.htlwels.it.insy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long oid;

    private boolean istZustellAdresse;
    private String strasse;
    private String hausNummer;
    private int postLeitZahl;
    private String ort;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "KUNDE_ADRESSE",
            joinColumns = {@JoinColumn (name = "ADRESSEOID")},
            inverseJoinColumns =  {@JoinColumn(name = "KUNDEOID")}
    )
    private List<Kunde> bewohner = new ArrayList<>();

    public Adresse() {
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public boolean isIstZustellAdresse() {
        return istZustellAdresse;
    }

    public void setIstZustellAdresse(boolean istZustellAdresse) {
        this.istZustellAdresse = istZustellAdresse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNummer() {
        return hausNummer;
    }

    public void setHausNummer(String hausNummer) {
        this.hausNummer = hausNummer;
    }

    public int getPostLeitZahl() {
        return postLeitZahl;
    }

    public void setPostLeitZahl(int postLeitZahl) {
        this.postLeitZahl = postLeitZahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public List<Kunde> getBewohner() {
        return bewohner;
    }

    public void setBewohner(List<Kunde> bewohner) {
        this.bewohner = bewohner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adresse adresse = (Adresse) o;

        if (istZustellAdresse != adresse.istZustellAdresse) return false;
        if (postLeitZahl != adresse.postLeitZahl) return false;
        if (oid != null ? !oid.equals(adresse.oid) : adresse.oid != null) return false;
        if (strasse != null ? !strasse.equals(adresse.strasse) : adresse.strasse != null) return false;
        if (hausNummer != null ? !hausNummer.equals(adresse.hausNummer) : adresse.hausNummer != null) return false;
        if (ort != null ? !ort.equals(adresse.ort) : adresse.ort != null) return false;
        return bewohner != null ? bewohner.equals(adresse.bewohner) : adresse.bewohner == null;
    }

    @Override
    public int hashCode() {
        int result = oid != null ? oid.hashCode() : 0;
        result = 31 * result + (istZustellAdresse ? 1 : 0);
        result = 31 * result + (strasse != null ? strasse.hashCode() : 0);
        result = 31 * result + (hausNummer != null ? hausNummer.hashCode() : 0);
        result = 31 * result + postLeitZahl;
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (bewohner != null ? bewohner.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "oid=" + oid +
                ", istZustellAdresse=" + istZustellAdresse +
                ", strasse='" + strasse + '\'' +
                ", hausNummer='" + hausNummer + '\'' +
                ", postLeitZahl=" + postLeitZahl +
                ", ort='" + ort + '\'' +
                ", bewohner=" + bewohner +
                '}';
    }
}
