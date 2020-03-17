package at.htlwels.it.insy.main;

import at.htlwels.it.insy.model.*;
import com.winklerlabs.ASCIIWriter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "school_SQLServer";
    private static EntityManagerFactory factory;

    private static Long schuljahrOID;


//    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        ASCIIWriter.printSignatureOne();

        System.out.println("**************************************************");
        System.out.println("**************************************************");
        System.out.println("***   Initialisierung                         ");
        System.out.println("**************************************************");

        

    }

 

}