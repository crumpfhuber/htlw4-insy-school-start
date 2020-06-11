package at.htlwels.it.insy.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long oid;

    private Date beginnDerGeschaefsBeziehung;
    private String klassifizierung;

    @OneToMany(mappedBy = "kunde", fetch = FetchType.LAZY)
    private List<Besuch> besuche = new ArrayList<>();

    @ManyToMany(mappedBy = "bewohner", fetch = FetchType.EAGER)
    private List<Adresse> adressen = new ArrayList<>();

    @OneToMany(mappedBy = "besitzer", fetch = FetchType.LAZY)
    private List<Produkt> produkte = new ArrayList<>();

    public Kunde() {
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getBeginnDerGeschaefsBeziehung() {
        return beginnDerGeschaefsBeziehung;
    }

    public void setBeginnDerGeschaefsBeziehung(Date beginnDerGeschaefsBeziehung) {
        this.beginnDerGeschaefsBeziehung = beginnDerGeschaefsBeziehung;
    }

    public String getKlassifizierung() {
        return klassifizierung;
    }

    public void setKlassifizierung(String klassifizierung) {
        this.klassifizierung = klassifizierung;
    }

    public List<Besuch> getBesuche() {
        return besuche;
    }

    public void setBesuche(List<Besuch> besuche) {
        this.besuche = besuche;
    }

    public List<Adresse> getAdressen() {
        return adressen;
    }

    public void setAdressen(List<Adresse> adressen) {
        this.adressen = adressen;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kunde kunde = (Kunde) o;

        if (oid != null ? !oid.equals(kunde.oid) : kunde.oid != null) return false;
        if (beginnDerGeschaefsBeziehung != null ? !beginnDerGeschaefsBeziehung.equals(kunde.beginnDerGeschaefsBeziehung) : kunde.beginnDerGeschaefsBeziehung != null)
            return false;
        if (klassifizierung != null ? !klassifizierung.equals(kunde.klassifizierung) : kunde.klassifizierung != null)
            return false;
        if (besuche != null ? !besuche.equals(kunde.besuche) : kunde.besuche != null) return false;
        if (adressen != null ? !adressen.equals(kunde.adressen) : kunde.adressen != null) return false;
        return produkte != null ? produkte.equals(kunde.produkte) : kunde.produkte == null;
    }

    @Override
    public int hashCode() {
        int result = oid != null ? oid.hashCode() : 0;
        result = 31 * result + (beginnDerGeschaefsBeziehung != null ? beginnDerGeschaefsBeziehung.hashCode() : 0);
        result = 31 * result + (klassifizierung != null ? klassifizierung.hashCode() : 0);
        result = 31 * result + (besuche != null ? besuche.hashCode() : 0);
        result = 31 * result + (adressen != null ? adressen.hashCode() : 0);
        result = 31 * result + (produkte != null ? produkte.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "oid=" + oid +
                ", beginnDerGeschaefsBeziehung=" + beginnDerGeschaefsBeziehung +
                ", klassifizierung='" + klassifizierung + '\'' +
                ", besuche=" + besuche +
                ", adressen=" + adressen +
                ", produkte=" + produkte +
                '}';
    }
}
