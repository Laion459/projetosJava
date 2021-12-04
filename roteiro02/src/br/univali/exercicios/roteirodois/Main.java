package br.univali.exercicios.roteirodois;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        LocalDate x = LocalDate.now();
        LocalDate z;

        Person a = new Person("Leo",LocalDate.of(1992, 2, 23));
        z = a.getDateOfBirth();

        Student s = new Student(55,LocalDate.of(1992, 2, 23), x);

        System.out.println(a.calculateAge());
        System.out.println("-----------------------------");
        System.out.println(Period.between(z,x).toString());
        System.out.println("-----------------------------");
        System.out.println(z);

    }
}
