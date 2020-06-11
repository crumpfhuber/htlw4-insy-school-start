package at.htlwels.it.insy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Besuch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long oid;

    private Date date;
    private String uhrZeit;
    private String beschreibung;
    private int bewertung;

    @ManyToOne
    @JoinColumn(name = "kundeOID", nullable = false)
    private Kunde kunde;

    public Besuch() {
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUhrZeit() {
        return uhrZeit;
    }

    public void setUhrZeit(String uhrZeit) {
        this.uhrZeit = uhrZeit;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Besuch besuch = (Besuch) o;

        if (bewertung != besuch.bewertung) return false;
        if (oid != null ? !oid.equals(besuch.oid) : besuch.oid != null) return false;
        if (date != null ? !date.equals(besuch.date) : besuch.date != null) return false;
        if (uhrZeit != null ? !uhrZeit.equals(besuch.uhrZeit) : besuch.uhrZeit != null) return false;
        if (beschreibung != null ? !beschreibung.equals(besuch.beschreibung) : besuch.beschreibung != null)
            return false;
        return kunde != null ? kunde.equals(besuch.kunde) : besuch.kunde == null;
    }

    @Override
    public int hashCode() {
        int result = oid != null ? oid.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (uhrZeit != null ? uhrZeit.hashCode() : 0);
        result = 31 * result + (beschreibung != null ? beschreibung.hashCode() : 0);
        result = 31 * result + bewertung;
        result = 31 * result + (kunde != null ? kunde.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Besuch{" +
                "oid=" + oid +
                ", date=" + date +
                ", uhrZeit='" + uhrZeit + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", bewertung=" + bewertung +
                ", kunde=" + kunde +
                '}';
    }
}
