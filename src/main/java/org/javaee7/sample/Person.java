package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta, eb
 */
@XmlRootElement
public class Person {
    private String lastName;
    private String fistName;
    private Integer age;
    private String mail;
    private String address;

    public Person() {
    }

    public Person(String lastName, String fistName, Integer age, String mail, String address) {
        this.lastName = lastName;
        this.fistName = fistName;
        this.age = age;
        this.mail = mail;
        this.address = address;
    }

    public String getLastName() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
        return lastName + " " + firstName + " <" + mail + ">";
    }
}