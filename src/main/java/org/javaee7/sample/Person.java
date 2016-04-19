package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta, eb
 */
@XmlRootElement
public class Person {
    private String name;
    private String mail;
    private String address;

    public Person() {
    }

    public Person(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name;
    }
}