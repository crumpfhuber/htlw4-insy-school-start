package at.htlwels.it.insy.model;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Abteilung {

   
    private Long oid;

    private String bezeichnung;
    private String kurzBezeichnung;

  
    private List<Fach> faecher = new ArrayList<>();

  
    private List<Schulklasse> schulKlassen = new ArrayList<>();

    public Abteilung() {

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

    public String getKurzBezeichnung() {
        return kurzBezeichnung;
    }

    public void setKurzBezeichnung(String kurzBezeichnung) {
        this.kurzBezeichnung = kurzBezeichnung;
    }

    public List<Schulklasse> getSchulKlassen() {
        return schulKlassen;
    }

    public void setSchulKlassen(List<Schulklasse> schulKlassen) {
        this.schulKlassen = schulKlassen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abteilung)) return false;
        Abteilung abteilung = (Abteilung) o;
        return Objects.equals(getOid(), abteilung.getOid()) &&
                Objects.equals(getBezeichnung(), abteilung.getBezeichnung()) &&
                Objects.equals(getKurzBezeichnung(), abteilung.getKurzBezeichnung());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getBezeichnung(), getKurzBezeichnung());
    }

    @Override
    public String toString() {
        return "Abteilung{" +
                "oid=" + oid +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", kurzBezeichnung='" + kurzBezeichnung + '\'' +
                '}';
    }

    public List<Fach> getFaecher() {
        return faecher;
    }

    public void setFaecher(List<Fach> faecher) {
        this.faecher = faecher;
    }
}
