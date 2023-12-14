package org.serpis.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String userName;
    private String password;
    private int userId;

    @OneToOne
    @JoinColumn(name = "personId", insertable = false, updatable = false)
    private Person person;

    public User() {

    }

    public User(String userName, String password, int userId, Person person) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.person = person;
    }

    public User(String userName, String password, Person person) {
        this.userName = userName;
        this.password = password;
        this.person = person;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
