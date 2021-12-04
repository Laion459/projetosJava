package br.univali.roteiro.quatro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        State s1 = new State("Santa Catarina", "SC");
        State s2 = new State("Santa Catarina", "SC");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("TRUE ==> " + s1.equals(s2));
        System.out.println("TRUE ==> " + s2.equals(s1));
        System.out.println("FALSE ==> " + (s1 == s2));

        // Verifica se a pré-condição está sendo testada
        //State s3 = new State("Santa Catarina", "");
        // Verifica se a pré-condição está sendo testada
        //State s4 = new State("", "SC");

        System.out.println("**********************");

        State x1 = new State("Santa Catarina", "SC");
        City y1 = new City("Florianopolis ", x1);
        Address a1 = new Address("Onildo Lemos ", null, y1, "88058700");
        Person p1 = new Person("Leonardo", LocalDate.now(), "laion@gmail.com", a1);

        System.out.println(p1);
    }
}
