package br.univali.exercicios.roteirodois;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate dateOfBirth;


    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

    public Period calculateAge() {
        Period age;
        LocalDate now = LocalDate.now();
        LocalDate leo = LocalDate.of(1992, 2, 23);
        age = Period.between(leo, now);
        System.out.println(age);
        //aqui age = local date em anos.
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
