package at.htlwels.it.insy.model;

import javax.persistence.*;
import java.util.Objects;


public class Raum {

    private Long oid;

    private Long sjOID;
    private String klassifizierung;
    private String raumNummer;
    private String schulTeil;
    private boolean muellTrennung;
    private boolean overheadVorhanden;
    private boolean beamerVorhanden;
    private int anzahlSitzplaetze;
    private int verkabelteSitzplaetze;
    private int bestomteSitzplaetze;

     private Schulklasse schulklasse;

    public Raum() {
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

    public String getKlassifizierung() {
        return klassifizierung;
    }

    public void setKlassifizierung(String klassifizierung) {
        this.klassifizierung = klassifizierung;
    }

    public String getRaumNummer() {
        return raumNummer;
    }

    public void setRaumNummer(String raumNummer) {
        this.raumNummer = raumNummer;
    }

    public String getSchulTeil() {
        return schulTeil;
    }

    public void setSchulTeil(String schulTeil) {
        this.schulTeil = schulTeil;
    }

    public boolean isMuellTrennung() {
        return muellTrennung;
    }

    public void setMuellTrennung(boolean muellTrennung) {
        this.muellTrennung = muellTrennung;
    }

    public boolean isOverheadVorhanden() {
        return overheadVorhanden;
    }

    public void setOverheadVorhanden(boolean overheadVorhanden) {
        this.overheadVorhanden = overheadVorhanden;
    }

    public boolean isBeamerVorhanden() {
        return beamerVorhanden;
    }

    public void setBeamerVorhanden(boolean beamerVorhanden) {
        this.beamerVorhanden = beamerVorhanden;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    public int getVerkabelteSitzplaetze() {
        return verkabelteSitzplaetze;
    }

    public void setVerkabelteSitzplaetze(int verkabelteSitzplaetze) {
        this.verkabelteSitzplaetze = verkabelteSitzplaetze;
    }

    public int getBestomteSitzplaetze() {
        return bestomteSitzplaetze;
    }

    public void setBestomteSitzplaetze(int bestomteSitzplaetze) {
        this.bestomteSitzplaetze = bestomteSitzplaetze;
    }

    public Schulklasse getSchulklasse() {
        return schulklasse;
    }

    public void setSchulklasse(Schulklasse schulklasse) {
        this.schulklasse = schulklasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Raum)) return false;
        Raum raum = (Raum) o;
        return isMuellTrennung() == raum.isMuellTrennung() &&
                isOverheadVorhanden() == raum.isOverheadVorhanden() &&
                isBeamerVorhanden() == raum.isBeamerVorhanden() &&
                getAnzahlSitzplaetze() == raum.getAnzahlSitzplaetze() &&
                getVerkabelteSitzplaetze() == raum.getVerkabelteSitzplaetze() &&
                getBestomteSitzplaetze() == raum.getBestomteSitzplaetze() &&
                Objects.equals(getOid(), raum.getOid()) &&
                Objects.equals(getSjOID(), raum.getSjOID()) &&
                Objects.equals(getKlassifizierung(), raum.getKlassifizierung()) &&
                Objects.equals(getRaumNummer(), raum.getRaumNummer()) &&
                Objects.equals(getSchulTeil(), raum.getSchulTeil());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getSjOID(), getKlassifizierung(), getRaumNummer(), getSchulTeil(), isMuellTrennung(), isOverheadVorhanden(), isBeamerVorhanden(), getAnzahlSitzplaetze(), getVerkabelteSitzplaetze(), getBestomteSitzplaetze());
    }

    @Override
    public String toString() {
        return "Raum{" +
                "oid=" + oid +
                ", sjOID=" + sjOID +
                ", klassifizierung='" + klassifizierung + '\'' +
                ", raumNummer='" + raumNummer + '\'' +
                ", schulTeil='" + schulTeil + '\'' +
                ", muellTrennung=" + muellTrennung +
                ", overheadVorhanden=" + overheadVorhanden +
                ", beamerVorhanden=" + beamerVorhanden +
                ", anzahlSitzplaetze=" + anzahlSitzplaetze +
                ", verkabelteSitzplaetze=" + verkabelteSitzplaetze +
                ", bestomteSitzplaetze=" + bestomteSitzplaetze +
                '}';
    }
}
