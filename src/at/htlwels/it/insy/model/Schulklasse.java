package at.htlwels.it.insy.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Schulklasse {


    private Long oid;

    private Long sjOID;

    private String jahrgang;
    private String klassenBezeichnung;


    private Raum raum;


    private Lehrer klassenVorstand;

    private Abteilung abteilung;

    private List<Schueler> schueler = new ArrayList<>();

    private List<at.htlwels.it.insy.model.Lehrer> lehrer = new ArrayList<>();

    private List<UnterrichtsEinheit> unterrichtsEinheiten = new ArrayList<>();

    public Schulklasse() {
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getSjOID() {
        return sjOID;
    }

    public void setSjOID(Long sjOID) {
        this.sjOID = sjOID;
    }

    public Lehrer getKlassenVorstand() {
        return klassenVorstand;
    }

    public void setKlassenVorstand(Lehrer klassenVorstand) {
        this.klassenVorstand = klassenVorstand;
    }

    public String getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }

    public String getKlassenBezeichnung() {
        return klassenBezeichnung;
    }

    public void setKlassenBezeichnung(String klassenBezeichnung) {
        this.klassenBezeichnung = klassenBezeichnung;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(Abteilung abteilung) {
        this.abteilung = abteilung;
    }

    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public List<Schueler> getSchueler() {
        return schueler;
    }

    public void setSchueler(List<Schueler> schueler) {
        this.schueler = schueler;
    }

    public List<Lehrer> getLehrer() {
        return lehrer;
    }

    public void setLehrer(List<Lehrer> lehrer) {
        this.lehrer = lehrer;
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
        if (!(o instanceof Schulklasse)) return false;
        Schulklasse that = (Schulklasse) o;
        return Objects.equals(getOid(), that.getOid()) &&
                Objects.equals(getSjOID(), that.getSjOID()) &&
                Objects.equals(getJahrgang(), that.getJahrgang()) &&
                Objects.equals(getKlassenBezeichnung(), that.getKlassenBezeichnung()) &&
                Objects.equals(getRaum(), that.getRaum()) &&
                Objects.equals(getKlassenVorstand(), that.getKlassenVorstand()) &&
                Objects.equals(getAbteilung(), that.getAbteilung()) &&
                Objects.equals(getSchueler(), that.getSchueler()) &&
                Objects.equals(getLehrer(), that.getLehrer()) &&
                Objects.equals(getUnterrichtsEinheiten(), that.getUnterrichtsEinheiten());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getSjOID(), getJahrgang(), getKlassenBezeichnung(), getRaum(), getKlassenVorstand(), getAbteilung(), getSchueler(), getLehrer(), getUnterrichtsEinheiten());
    }

    @Override
    public String toString() {
        return "Schulklasse{" +
                "oid=" + oid +
                ", sjOID=" + sjOID +
                ", jahrgang='" + jahrgang + '\'' +
                ", klassenBezeichnung='" + klassenBezeichnung + '\'' +
                ", raum=" + raum +
                ", klassenVorstand=" + klassenVorstand +
                ", abteilung=" + abteilung +
                ", schueler=" + schueler +
                ", lehrer=" + lehrer +
                ", unterrichtsEinheiten=" + unterrichtsEinheiten +
                '}';
    }
}
