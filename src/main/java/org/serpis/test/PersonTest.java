package org.serpis.test;

import org.serpis.model.Person;

import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersonTest {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Person newPerson = new Person("Duncan", "Rua", "dr@gmail.com", "4444");
        log.debug("Objeto a persistir: " + newPerson);

        em.persist(newPerson);

        tx.commit();
        em.close();
    }
}
