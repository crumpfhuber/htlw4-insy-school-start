package at.htlwels.it.insy.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Lehrer extends Person implements Serializable {

    private String akademischerTitel;
    private String abgeschlosseneStudienRichtungen;
    private String fachEinstufung;
    private Timestamp beginnUnterrichtsTaetigkeit;
    private int unterrrichtsJahre;

    @OneToOne(mappedBy = "klassenVorstand")
    private Schulklasse klassenVorstandSchulklasse;

    @OneToMany(mappedBy="lehrer")
    private List<UnterrichtsEinheit> unterrichtsEinheiten;

    @ManyToMany(mappedBy ="lehrer")
    List<Fach> faecher;

    @ManyToMany(mappedBy ="lehrer")
    List<Schulklasse> schulklassen;

    public Lehrer() {
        unterrichtsEinheiten = new ArrayList<>();
        faecher = new ArrayList<>();
        schulklassen = new ArrayList<>();
    }

    public Schulklasse getKlassenVorstandSchulklasse() {
        return klassenVorstandSchulklasse;
    }

    public void setKlassenVorstandSchulklasse(Schulklasse klassenVorstandSchulklasse) {
        this.klassenVorstandSchulklasse = klassenVorstandSchulklasse;
    }

    public String getAkademischerTitel() {
        return akademischerTitel;
    }

    public void setAkademischerTitel(String akademischerTitel) {
        this.akademischerTitel = akademischerTitel;
    }



    public String getAbgeschlosseneStudienRichtungen() {
        return abgeschlosseneStudienRichtungen;
    }

    public void setAbgeschlosseneStudienRichtungen(String abgeschlosseneStudienRichtungen) {
        this.abgeschlosseneStudienRichtungen = abgeschlosseneStudienRichtungen;
    }

    public String getFachEinstufung() {
        return fachEinstufung;
    }

    public void setFachEinstufung(String fachEinstufung) {
        this.fachEinstufung = fachEinstufung;
    }

    public Timestamp getBeginnUnterrichtsTaetigkeit() {
        return beginnUnterrichtsTaetigkeit;
    }

    public void setBeginnUnterrichtsTaetigkeit(Timestamp beginnUnterrichtsTaetigkeit) {
        this.beginnUnterrichtsTaetigkeit = beginnUnterrichtsTaetigkeit;
    }

    public int getUnterrrichtsJahre() {
        return unterrrichtsJahre;
    }

    public void setUnterrrichtsJahre(int unterrrichtsJahre) {
        this.unterrrichtsJahre = unterrrichtsJahre;
    }

    public List<Fach> getFaecher() {
        return faecher;
    }

    public void setFaecher(List<Fach> faecher) {
        this.faecher = faecher;
    }

    public List<Schulklasse> getSchulklassen() {
        return schulklassen;
    }

    public void setSchulklassen(List<Schulklasse> schulklassen) {
        this.schulklassen = schulklassen;
    }

    public List<UnterrichtsEinheit> getUnterrichtsEinheiten() {
        return unterrichtsEinheiten;
    }

    public void setUnterrichtsEinheiten(List<UnterrichtsEinheit> unterrichtsEinheiten) {
        this.unterrichtsEinheiten = unterrichtsEinheiten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lehrer)) return false;
        if (!super.equals(o)) return false;
        Lehrer lehrer = (Lehrer) o;
        return getUnterrrichtsJahre() == lehrer.getUnterrrichtsJahre() &&
                Objects.equals(getAkademischerTitel(), lehrer.getAkademischerTitel()) &&
                Objects.equals(getAbgeschlosseneStudienRichtungen(), lehrer.getAbgeschlosseneStudienRichtungen()) &&
                Objects.equals(getFachEinstufung(), lehrer.getFachEinstufung()) &&
                Objects.equals(getBeginnUnterrichtsTaetigkeit(), lehrer.getBeginnUnterrichtsTaetigkeit()) &&
                Objects.equals(getKlassenVorstandSchulklasse(), lehrer.getKlassenVorstandSchulklasse()) &&
                Objects.equals(getFaecher(), lehrer.getFaecher()) &&
                Objects.equals(getSchulklassen(), lehrer.getSchulklassen()) &&
                Objects.equals(getUnterrichtsEinheiten(), lehrer.getUnterrichtsEinheiten());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAkademischerTitel(), getAbgeschlosseneStudienRichtungen(), getFachEinstufung(), getBeginnUnterrichtsTaetigkeit(), getUnterrrichtsJahre(), getKlassenVorstandSchulklasse(), getFaecher(), getSchulklassen(), getUnterrichtsEinheiten());
    }

    @Override
    public String toString() {
        return "Lehrer{} " + super.toString();


    }
}
