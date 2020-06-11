package at.htlwels.it.insy.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "ProduktTYP", discriminatorType = DiscriminatorType.STRING)
public abstract class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long oid;

    private Timestamp eroeffnungsDatum;
    private String interneBezeichnung;
    private Timestamp ablaufDatum;

    @ManyToOne
    @JoinColumn(name = "besitzerOID", nullable = false)
    private Kunde besitzer;

    public Produkt() {
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Timestamp getEroeffnungsDatum() {
        return eroeffnungsDatum;
    }

    public void setEroeffnungsDatum(Timestamp eroeffnungsDatum) {
        this.eroeffnungsDatum = eroeffnungsDatum;
    }

    public String getInterneBezeichnung() {
        return interneBezeichnung;
    }

    public void setInterneBezeichnung(String interneBezeichnung) {
        this.interneBezeichnung = interneBezeichnung;
    }

    public Timestamp getAblaufDatum() {
        return ablaufDatum;
    }

    public void setAblaufDatum(Timestamp ablaufDatum) {
        this.ablaufDatum = ablaufDatum;
    }

    public Kunde getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Kunde besitzer) {
        this.besitzer = besitzer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;

        if (oid != null ? !oid.equals(produkt.oid) : produkt.oid != null) return false;
        if (eroeffnungsDatum != null ? !eroeffnungsDatum.equals(produkt.eroeffnungsDatum) : produkt.eroeffnungsDatum != null)
            return false;
        if (interneBezeichnung != null ? !interneBezeichnung.equals(produkt.interneBezeichnung) : produkt.interneBezeichnung != null)
            return false;
        if (ablaufDatum != null ? !ablaufDatum.equals(produkt.ablaufDatum) : produkt.ablaufDatum != null) return false;
        return besitzer != null ? besitzer.equals(produkt.besitzer) : produkt.besitzer == null;
    }

    @Override
    public int hashCode() {
        int result = oid != null ? oid.hashCode() : 0;
        result = 31 * result + (eroeffnungsDatum != null ? eroeffnungsDatum.hashCode() : 0);
        result = 31 * result + (interneBezeichnung != null ? interneBezeichnung.hashCode() : 0);
        result = 31 * result + (ablaufDatum != null ? ablaufDatum.hashCode() : 0);
        result = 31 * result + (besitzer != null ? besitzer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "oid=" + oid +
                ", eroeffnungsDatum=" + eroeffnungsDatum +
                ", interneBezeichnung='" + interneBezeichnung + '\'' +
                ", ablaufDatum=" + ablaufDatum +
                ", besitzer=" + besitzer +
                '}';
    }
}
