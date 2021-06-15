package at.htlwels.it.insy.main;

import at.htlwels.it.insy.model.*;
import com.winklerlabs.ASCIIWriter;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.winklerlabs.ASCIIWriter.*;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "school_MySQL";
    private static EntityManagerFactory factory;
    private static EntityManager manager;

    private static Long schuljahrOID;


//    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        manager = factory.createEntityManager();

        //printSignatureOne();

        System.out.println("******************************");
        System.out.println("-> Initialisierung");
        System.out.println("******************************");


        erzeugeObjekte();

    }

    public static void erzeugeObjekte() {
        System.out.println("******************************");
        System.out.println("-> Objekt-Katastrophe");
        System.out.println("******************************");

        // erste transaktion
        manager.getTransaction().begin();

        // erzeuge schuljahr
        Schuljahr schuljahr = new Schuljahr();
        schuljahr.setBezeichnung("2020/2021");
        schuljahr.setBeginDatum(Timestamp.valueOf(LocalDateTime.of(2020, 9, 14, 0, 0)));
        schuljahr.setEndDatum(Timestamp.valueOf(LocalDateTime.of(2021, 7, 9, 0, 0)));

        manager.persist(schuljahr);
        manager.getTransaction().commit();

        // speichern der schuljahr id
        schuljahrOID = schuljahr.getOid();

        System.out.println("1) Schuljahr: " + schuljahr);
    }

 

}