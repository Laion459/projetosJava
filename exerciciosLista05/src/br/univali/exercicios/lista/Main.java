package br.univali.exercicios.lista;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person x = new Person(LocalDate.now(), LocalDate.now(),"Coco");
        System.out.println(x.today);
    }
}
