package br.univali.roteiro.quatro;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private Integer nextId = 1;
    private Integer id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private final Address address;

    public Person(String name, LocalDate dateOfBirth, String email, Address address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return new Address(address.getStreetLine1(), address.getStretLine2(), address.getCity(),
                address.getZipCode());
    }

    @Override
    public String toString() {
        return "Person{" +
                "nextId=" + nextId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    // falta #appendToString():String


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getNextId(), person.getNextId()) && Objects.equals(getId(), person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNextId(), getId(), getName(), getDateOfBirth(), getEmail(), getAddress());
    }
}
