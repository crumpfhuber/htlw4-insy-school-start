package at.htlwels.it.insy.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    private String vorName;
    private String familieNname;
    private Timestamp geburtsDatum;
    private String geburtsOrt;
    private String office365Kennung;
    private String schnulNetzKennzeichen;

    public Person() {

    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getFamilieNname() {
        return familieNname;
    }

    public void setFamilieNname(String familieNname) {
        this.familieNname = familieNname;
    }

    public Timestamp getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Timestamp geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getGeburtsOrt() {
        return geburtsOrt;
    }

    public void setGeburtsOrt(String geburtsOrt) {
        this.geburtsOrt = geburtsOrt;
    }

    public String getOffice365Kennung() {
        return office365Kennung;
    }

    public void setOffice365Kennung(String office365Kennung) {
        this.office365Kennung = office365Kennung;
    }

    public String getSchnulNetzKennzeichen() {
        return schnulNetzKennzeichen;
    }

    public void setSchnulNetzKennzeichen(String schnulNetzKennzeichen) {
        this.schnulNetzKennzeichen = schnulNetzKennzeichen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getOid(), person.getOid()) &&
                Objects.equals(getVorName(), person.getVorName()) &&
                Objects.equals(getFamilieNname(), person.getFamilieNname()) &&
                Objects.equals(getGeburtsDatum(), person.getGeburtsDatum()) &&
                Objects.equals(getGeburtsOrt(), person.getGeburtsOrt()) &&
                Objects.equals(getOffice365Kennung(), person.getOffice365Kennung()) &&
                Objects.equals(getSchnulNetzKennzeichen(), person.getSchnulNetzKennzeichen());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getVorName(), getFamilieNname(), getGeburtsDatum(), getGeburtsOrt(), getOffice365Kennung(), getSchnulNetzKennzeichen());
    }

    @Override
    public String toString() {
        return "Person{" +
                "oid=" + oid +
                ", vorName='" + vorName + '\'' +
                ", familieNname='" + familieNname + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", geburtsOrt='" + geburtsOrt + '\'' +
                ", office365Kennung='" + office365Kennung + '\'' +
                ", schnulNetzKennzeichen='" + schnulNetzKennzeichen + '\'' +
                '}';
    }
}
