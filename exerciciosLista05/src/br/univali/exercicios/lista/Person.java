package br.univali.exercicios.lista;

import java.time.LocalDate;
import java.time.Period;


public class Person {

    LocalDate myBirthDay = LocalDate.of(1992, 2, 23);
    LocalDate today = LocalDate.now();
    String name;

    public Person(LocalDate myBirthDay, LocalDate today, String name) {
        this.myBirthDay = myBirthDay;
        this.today = today;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myBirthDay=" + myBirthDay +
                ", today=" + today +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LocalDate myBirthDay = LocalDate.of(1992, 2, 23);
        LocalDate today = LocalDate.now();


        System.out.println(" my age: " + Period.between(myBirthDay, today).getYears());
        System.out.println(" My date: " + myBirthDay);
        System.out.println(" Now: " + today);

    }
}
