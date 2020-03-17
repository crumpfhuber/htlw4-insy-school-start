package at.htlwels.it.insy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;


public class Schuljahr {


    private Long oid;

    private String bezeichnung;
    private Timestamp beginDatum;
    private Timestamp endDatum;

    public Schuljahr() {

    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Timestamp getBeginDatum() {
        return beginDatum;
    }

    public void setBeginDatum(Timestamp beginDatum) {
        this.beginDatum = beginDatum;
    }

    public Timestamp getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(Timestamp endDatum) {
        this.endDatum = endDatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schuljahr)) return false;
        Schuljahr schuljahr = (Schuljahr) o;
        return getOid().equals(schuljahr.getOid()) &&
                getBezeichnung().equals(schuljahr.getBezeichnung()) &&
                getBeginDatum().equals(schuljahr.getBeginDatum()) &&
                getEndDatum().equals(schuljahr.getEndDatum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getBezeichnung(), getBeginDatum(), getEndDatum());
    }

    @Override
    public String toString() {
        return "Schuljahr{" +
                "oid=" + oid +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", beginDatum=" + beginDatum +
                ", endDatum=" + endDatum +
                '}';
    }
}
