package at.htlwels.it.insy.model;

import javax.persistence.*;
import java.util.Objects;


public class UnterrichtsEinheit {


    private Long oid;

    private Long sjOID;


    private Schulklasse schulKlasse;

    private Lehrer lehrer;

    private Fach fach;

    public UnterrichtsEinheit() {
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

    public Schulklasse getSchulKlasse() {
        return schulKlasse;
    }

    public void setSchulKlasse(Schulklasse theSchulKlasse) {
        this.schulKlasse = theSchulKlasse;
    }

    public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }

    public Fach getFach() {
        return fach;
    }

    public void setFach(Fach fach) {
        this.fach = fach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnterrichtsEinheit)) return false;
        UnterrichtsEinheit that = (UnterrichtsEinheit) o;
        return Objects.equals(getOid(), that.getOid()) &&
                Objects.equals(getSjOID(), that.getSjOID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getSjOID());
    }

    @Override
    public String toString() {
        return "UnterrichtsEinheit{" +
                "oid=" + oid +
                ", sjOID=" + sjOID +
                '}';
    }

}
