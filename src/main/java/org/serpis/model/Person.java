/**
 * @author Sergi Marrahy Arenas
 * @version 1.0
 */

package org.serpis.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    //SerialVersion
    private static final long SerialVersionUID = 1L;

    //Columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personId")
    private int personId;
    private String name;
    private String surnames;
    private String email;
    private String phone;

    //Custom constructor
    public Person() {

    }

    public Person(String name, String surnames, String email, String phone) {
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.phone = phone;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
