package org.serpis.test;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import org.serpis.model.Person;
import org.serpis.model.User;

public class UserTest {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgendaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Person newPerson = em.find(Person.class, 0);

        User newUser = new User("usuarioprueba1", "123456", newPerson);
        log.debug("Objeto a persistir: " + newUser);

        em.persist(newUser);

        tx.commit();
        em.close();
    }
}
