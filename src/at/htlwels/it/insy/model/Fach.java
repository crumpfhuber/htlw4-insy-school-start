package at.htlwels.it.insy.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Fach {

   
    private Long oid;

    private Long sjOID;
    private String Bezeichnung;
    private int anzahlWochenStunden;
    private int stundenTeiler;

    private Abteilung abteilung;

    private List<UnterrichtsEinheit> unterrichtsEinheiten = new ArrayList<>();



    private List<Lehrer> lehrer = new ArrayList<>();


    public Fach() {
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

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public int getAnzahlWochenStunden() {
        return anzahlWochenStunden;
    }

    public void setAnzahlWochenStunden(int anzahlWochenStunden) {
        this.anzahlWochenStunden = anzahlWochenStunden;
    }

    public int getStundenTeiler() {
        return stundenTeiler;
    }

    public void setStundenTeiler(int stundenTeiler) {
        this.stundenTeiler = stundenTeiler;
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
        if (!(o instanceof Fach)) return false;
        Fach fach = (Fach) o;
        return getAnzahlWochenStunden() == fach.getAnzahlWochenStunden() &&
                getStundenTeiler() == fach.getStundenTeiler() &&
                getOid().equals(fach.getOid()) &&
                getSjOID().equals(fach.getSjOID()) &&
                getBezeichnung().equals(fach.getBezeichnung());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getSjOID(), getBezeichnung(), getAnzahlWochenStunden(), getStundenTeiler());
    }

    @Override
    public String toString() {
        return "Fach{" +
                "oid=" + oid +
                ", sjOID=" + sjOID +
                ", Bezeichnung='" + Bezeichnung + '\'' +
                ", anzahlWochenStunden=" + anzahlWochenStunden +
                ", stundenTeiler=" + stundenTeiler +
                '}';
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(Abteilung abteilung) {
        this.abteilung = abteilung;
    }
}
