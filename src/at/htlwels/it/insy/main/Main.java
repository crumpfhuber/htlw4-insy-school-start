package at.htlwels.it.insy.main;

import at.htlwels.it.insy.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "school_MySQL";
    private static EntityManagerFactory factory;
    private static EntityManager manager;

    private static Long schuljahrOID;


//    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        System.out.println("******************************");
        System.out.println("-> Initialisierung");
        System.out.println("******************************");

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        manager = factory.createEntityManager();

        //printSignatureOne();

        test();
    }

    public static void test() {
        System.out.println("******************************");
        System.out.println("-> Objekt-Katastrophe");
        System.out.println("******************************");

        manager.getTransaction().begin();

        System.out.println("1) Erzeuge Schuljahr");
        Schuljahr schuljahr = new Schuljahr();
        schuljahr.setBezeichnung("2020/2021");
        schuljahr.setBeginDatum(Timestamp.valueOf(LocalDateTime.of(2020, 9, 14, 0, 0)));
        schuljahr.setEndDatum(Timestamp.valueOf(LocalDateTime.of(2021, 7, 9, 0, 0)));

        manager.persist(schuljahr);
        manager.getTransaction().commit();

        // speichern der schuljahr id
        schuljahrOID = schuljahr.getOid();

        System.out.println("2) Erzeuge Abteilung");

        Abteilung it = new Abteilung();
        it.setBezeichnung("Informationstechnologie");
        it.setKurzBezeichnung("IT");

        Abteilung ch = new Abteilung();
        ch.setBezeichnung("Chemie");
        ch.setKurzBezeichnung("CH");

        Abteilung et = new Abteilung();
        et.setBezeichnung("Elektrotechnik");
        et.setKurzBezeichnung("ET");

        Abteilung mb = new Abteilung();
        mb.setBezeichnung("Maschinenbau");
        mb.setKurzBezeichnung("MB");

        Abteilung mt = new Abteilung();
        mt.setBezeichnung("Mechatronik");
        mt.setKurzBezeichnung("MT");

        System.out.println("3) Erzeuge Klassen");

        Fach insy = new Fach();
        insy.setBezeichnung("Informationssysteme");
        insy.setSjOID(schuljahrOID);
        insy.setAnzahlWochenStunden(3);
        insy.setStundenTeiler(20);
        insy.setAbteilung(it);

        Fach sew = new Fach();
        sew.setBezeichnung("Softwareentwicklung");
        sew.setSjOID(schuljahrOID);
        sew.setAnzahlWochenStunden(5);
        sew.setStundenTeiler(0);
        sew.setAbteilung(it);

        it.getFaecher().add(insy);
        it.getFaecher().add(sew);

        System.out.println("4) Erzeuge Schüler");

        Schueler clemens = new Schueler();
        clemens.setFamilieNname("Rumpfhuber");
        clemens.setVorName(("Clemens"));
        clemens.setGeburtsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2002, 10, 6, 0,0))));
        clemens.setGeburtsOrt("Wels");
        clemens.setOffice365Kennung("clemens.rumpfhuber@htl-wels.at");
        clemens.setSchnulNetzKennzeichen("rumpfhuber.cle");
        clemens.setSchulEintrittsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2016, 8, 10, 0,0))));
        clemens.setSchuelerIdentifikationsNummer(100);

        Schueler christoph = new Schueler();
        christoph.setFamilieNname("Schmitsberger");
        christoph.setVorName(("Christoph"));
        christoph.setGeburtsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2003, 3, 8, 0,0))));
        christoph.setGeburtsOrt("Wels");
        christoph.setOffice365Kennung("christoph.schmitsberger@htl-wels.at");
        christoph.setSchnulNetzKennzeichen("schmitsberger.chr");
        christoph.setSchulEintrittsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2016, 8, 10, 0,0))));
        christoph.setSchuelerIdentifikationsNummer(101);

        Schueler tobias = new Schueler();
        tobias.setFamilieNname("Schmidt");
        tobias.setVorName(("Tobias"));
        tobias.setGeburtsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2002, 10, 5, 0,0))));
        tobias.setGeburtsOrt("Wels");
        tobias.setOffice365Kennung("tobias.schmidt@htl-wels.at");
        tobias.setSchnulNetzKennzeichen("schmidt.tob");
        tobias.setSchulEintrittsDatum(java.sql.Timestamp.valueOf((LocalDateTime.of(2016, 8, 10, 0,0))));
        tobias.setSchuelerIdentifikationsNummer(102);

        ArrayList<Schueler> schueler = new ArrayList<>();
        schueler.add(clemens);
        schueler.add(christoph);
        schueler.add(tobias);

        System.out.println("5) Erzeuge Lehrer");

        Lehrer winj = new Lehrer();
        winj.setFamilieNname("Winkler");
        winj.setVorName(("Josef"));
        winj.setGeburtsDatum(Timestamp.valueOf((LocalDateTime.of(1975, 9, 6, 0,0))));
        winj.setBeginnUnterrichtsTaetigkeit(Timestamp.valueOf((LocalDateTime.of(2010, 1, 1, 0,0))));
        winj.setGeburtsOrt("Raab");
        winj.setOffice365Kennung("josef.winkler@htl-wels.at");
        winj.setSchnulNetzKennzeichen("WINJ");
        winj.setAkademischerTitel("Mag.");
        winj.setAbgeschlosseneStudienRichtungen("Wirtschaftsinformatik");
        winj.setFachEinstufung("Informationstechologie");
        winj.setUnterrrichtsJahre(10);

        Lehrer helt = new Lehrer();
        helt.setFamilieNname("Helml");
        helt.setVorName(("Thomas"));
        helt.setGeburtsDatum(Timestamp.valueOf((LocalDateTime.of(1975, 9, 6, 0,0))));
        helt.setBeginnUnterrichtsTaetigkeit(Timestamp.valueOf((LocalDateTime.of(2010, 1, 1, 0,0))));
        helt.setGeburtsOrt("Timelkam");
        helt.setOffice365Kennung("thomas.helml@htl-wels.at");
        helt.setSchnulNetzKennzeichen("WINJ");
        helt.setAkademischerTitel("DI");
        helt.setAbgeschlosseneStudienRichtungen("Informatik");
        helt.setFachEinstufung("Informationstechologie");
        helt.setUnterrrichtsJahre(10);

        winj.getFaecher().add(insy);
        helt.getFaecher().add(sew);

        System.out.println("6) Erzeuge Raum");

        Raum klassenzimmer = new Raum();
        klassenzimmer.setSjOID(schuljahrOID);
        klassenzimmer.setKlassifizierung("Klassenraum");
        klassenzimmer.setRaumNummer("100");
        klassenzimmer.setSchulTeil("Trakt 1");
        klassenzimmer.setMuellTrennung(true);
        klassenzimmer.setOverheadVorhanden(true);
        klassenzimmer.setBeamerVorhanden(true);
        klassenzimmer.setAnzahlSitzplaetze(24);
        klassenzimmer.setVerkabelteSitzplaetze(24);
        klassenzimmer.setBestomteSitzplaetze(24);

        System.out.println("7) Erzeuge Raum");

        Schulklasse klasse = new Schulklasse();
        klasse.setSjOID(schuljahrOID);
        klasse.setJahrgang("4");
        klasse.setKlassenBezeichnung("4AHIT");
        klasse.setAbteilung(it);
        klasse.setKlassenVorstand(helt);

        helt.setKlassenVorstandSchulklasse(klasse);


        it.getSchulKlassen().add((klasse));
        klasse.setRaum(klassenzimmer);
        klassenzimmer.setSchulklasse(klasse);

        klasse.setSchueler(schueler);


        schueler.forEach(s -> s.setSchulKlasse(klasse));


        klasse.getLehrer().add(winj);
        klasse.getLehrer().add(helt);
        winj.getSchulklassen().add(klasse);
        helt.getSchulklassen().add(klasse);


        System.out.println("8) Erzeuge Unterrichtseinheiten");

        UnterrichtsEinheit einheit1 = new UnterrichtsEinheit();
        UnterrichtsEinheit einheit2 = new UnterrichtsEinheit();

        einheit1.setSjOID(schuljahrOID);
        einheit1.setFach(insy);
        einheit1.setLehrer(winj);
        einheit1.setSchulKlasse(klasse);
        insy.getUnterrichtsEinheiten().add(einheit1);
        winj.getUnterrichtsEinheiten().add(einheit1);
        klasse.getUnterrichtsEinheiten().add(einheit1);

        einheit2.setSjOID(schuljahrOID);
        einheit2.setFach(sew);
        einheit2.setLehrer(helt);
        einheit2.setSchulKlasse(klasse);
        sew.getUnterrichtsEinheiten().add(einheit1);
        helt.getUnterrichtsEinheiten().add(einheit1);
        klasse.getUnterrichtsEinheiten().add(einheit1);



        System.out.println("******************************");
        System.out.println("-> Datenbank-Katastrophe");
        System.out.println("******************************");

        manager.getTransaction().begin();

        System.out.println("1) Persistiere Abteilungen");

        manager.persist(it);
        manager.persist(ch);
        manager.persist(et);
        manager.persist(mb);
        manager.persist(mt);

        System.out.println("2) Persistiere Raum");

        manager.persist(klassenzimmer);

        System.out.println("3) Persistiere Schüler");

        schueler.forEach(s -> manager.persist(s));

        System.out.println("4) Persistiere Lehrer");

        manager.persist(winj);
        manager.persist(helt);

        System.out.println("5) Persistiere Fächer");

        manager.persist(insy);
        manager.persist(sew);

        System.out.println("6) Persistiere Unterrichtseinheit");

        manager.persist(einheit1);
        manager.persist(einheit2);

        System.out.println("7) Persistiere Klasse");

        manager.persist(klasse);

        System.out.println("8) Commit");

        manager.getTransaction().commit();

        System.out.println("******************************");
        System.out.println("-> Katastrophe BEENDET. JUHUUUU");
        System.out.println("******************************");

        manager.close();

    }
}