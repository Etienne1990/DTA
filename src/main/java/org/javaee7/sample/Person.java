package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta, eb
 */
@XmlRootElement
public class Person {
    private String lastName;
    private String fistName;
    private String mail;

    public Person() {
    }

    public Person(String lastName, String fistName, String mail) {
        this.lastName = lastName;
        this.fistName = fistName;
        this.mail = mail;
    }

    public String getName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return lastName;
    }
}