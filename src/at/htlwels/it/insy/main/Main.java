package at.htlwels.it.insy.main;

import at.htlwels.it.insy.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static com.winklerlabs.ASCIIWriter.*;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "school_MySQL";

//    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
     EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

       EntityManager entityManager = factory.createEntityManager();
       entityManager.getTransaction().begin();


        printSignatureOne();

        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("***   Initialisierung                         ");
        System.out.println("**************************************************");

        // Test Privatkunde
        // ------------------------------------------------------------------------------------------------------------

        PrivatKunde heinz = new PrivatKunde();
        heinz.setBeginnDerGeschaefsBeziehung(java.sql.Date.valueOf(LocalDate.of(2016, 1, 11)));
        heinz.setKlassifizierung("B");
        heinz.setVorName("Heinz");
        heinz.setFamilienName("Ketchup");
        heinz.setGeburtsDatum(java.sql.Date.valueOf(LocalDate.of(2000, 11, 1)));
        heinz.setGeburtsOrt("Tipfling");

        Besuch bp1 = new Besuch();
        bp1.setBeschreibung("Kontoeröffnung");
        bp1.setDate(java.sql.Date.valueOf(LocalDate.of(2016, 9, 1)));
        bp1.setUhrZeit("11:00");
        bp1.setBewertung(2);
        bp1.setKunde(heinz);
        heinz.getBesuche().add(bp1);

        Besuch bp2 = new Besuch();
        bp2.setBeschreibung("Geldabhebung € 800,00");
        bp2.setDate(java.sql.Date.valueOf(LocalDate.of(2016, 10, 1)));
        bp2.setUhrZeit("11:00");
        bp2.setBewertung(2);
        bp2.setKunde(heinz);
        heinz.getBesuche().add(bp2);

        Besuch bp3 = new Besuch();
        bp3.setBeschreibung("Geldeinzahlung € 150,00");
        bp3.setDate(java.sql.Date.valueOf(LocalDate.of(2016, 10, 2)));
        bp3.setUhrZeit("11:00");
        bp3.setBewertung(1);
        bp3.setKunde(heinz);
        heinz.getBesuche().add(bp3);

        Adresse ma = new Adresse();
        ma.setIstZustellAdresse(true);
        ma.setStrasse("Hunderterweg");
        ma.setHausNummer("100");
        ma.setPostLeitZahl(100100);
        ma.setOrt("Schaffensburg");
        ma.getBewohner().add(heinz);
        heinz.getAdressen().add(ma);

        Sparbuch sb1 = new Sparbuch();
        sb1.setEroeffnungsDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2016, 11, 2, 12, 0, 0)));
        sb1.setInterneBezeichnung("Sparbuch für das Glück");
        sb1.setAblaufDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2026, 11, 2, 12, 0, 0)));
        sb1.setAktuellerSparSaldo(2000.00);
        sb1.setSperrdauerInMonaten(6);
        sb1.setZinsSatz(1.25F);
        sb1.setBesitzer(heinz);
        heinz.getProdukte().add(sb1);

        Bausparvertrag bsv1 = new Bausparvertrag();
        bsv1.setEroeffnungsDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2016, 11, 2, 12, 0, 0)));
        bsv1.setInterneBezeichnung("Heislbauer");
        bsv1.setAblaufDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2026, 11, 2, 12, 0, 0)));
        bsv1.setMonatlicheRate(888.090);
        bsv1.setPraemie(100.00);
        bsv1.setGesamteLaufzeitInMonaten(60);
        bsv1.setGaranierterZinssatz(1.25F);
        bsv1.setBesitzer(heinz);
        heinz.getProdukte().add(bsv1);

        entityManager.persist(heinz);
        entityManager.persist(bp1);
        entityManager.persist(bp2);
        entityManager.persist(bp3);
        entityManager.persist(ma);
        entityManager.persist(sb1);
        entityManager.persist(bsv1);

        entityManager.getTransaction().commit();

        // Test Firmenkunde
        // ------------------------------------------------------------------------------------------------------------
        entityManager.getTransaction().begin();

        FirmenKunde hwc = new FirmenKunde();
        hwc.setBeginnDerGeschaefsBeziehung(java.sql.Date.valueOf(LocalDate.of(2015, 10, 7)));
        hwc.setKlassifizierung("A");
        hwc.setFirmenKuerzel("HWC");
        hwc.setFirmenLangbezeichung("HTL Wels Consulting");
        hwc.setGesellschaftsForm("GesmbH");
        hwc.setGruendungsDatum(java.sql.Date.valueOf(LocalDate.of(1975, 9, 1)));
        hwc.setGruendungsOrt("Wels");

        Besuch fp1 = new Besuch();
        fp1.setBeschreibung("Kontoeröffnung");
        fp1.setDate(java.sql.Date.valueOf(LocalDate.of(2016, 9, 1)));
        fp1.setUhrZeit("11:00");
        fp1.setBewertung(2);
        fp1.setKunde(hwc);
        hwc.getBesuche().add(fp1);

        Adresse fa = new Adresse();
        fa.setIstZustellAdresse(true);
        fa.setStrasse("Am Fachrhein");
        fa.setHausNummer("100");
        fa.setPostLeitZahl(200200);
        fa.setOrt("Wels");
        fa.getBewohner().add(hwc);
        hwc.getAdressen().add(fa);



        Kredit krdt = new Kredit();
        krdt.setEroeffnungsDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2017, 9, 2, 12, 0, 0)));
        krdt.setInterneBezeichnung("Firmenkredit ohne Sorgen");
        krdt.setAblaufDatum(java.sql.Timestamp.valueOf(LocalDateTime.of(2047, 9, 2, 12, 0, 0)));
        krdt.setBasisKreditBetrag(1000000.00);
        krdt.setAktuellerSaldo(950001.22);
        krdt.setAktuellerZinsSatz(0.75F);
        krdt.setAusstehendeTilgungen(0);

        krdt.setBesitzer(hwc);
        hwc.getProdukte().add(krdt);

        entityManager.persist(hwc);
        entityManager.persist(fp1);
        entityManager.persist(fa);
        entityManager.persist(krdt);
        entityManager.getTransaction().commit();

        entityManager.close();

        // Query der persistierten Objekte
        // ------------------------------------------------------------------------------------------------------------
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        System.out.println("***   Test --> Lese Kunden");
        System.out.println("**************************************************");

        TypedQuery<Kunde> query = em.createQuery("select s from Kunde s", Kunde.class);
        List<Kunde> kundenListe = query.getResultList();

        // This is pragmatic Code, not more.
        for (Kunde kundeTemp : kundenListe) {


         System.out.println("***   Kunde: " + kundeTemp.getOid());
         System.out.println("**************************************************");
         System.out.println(kundeTemp.toString());
         System.out.println("**************************************************");
        }

     em.close();

        

    }

 

}