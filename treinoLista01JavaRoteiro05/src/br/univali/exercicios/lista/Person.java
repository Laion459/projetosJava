package br.univali.exercicios.lista;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {

    private static int date ;

    public static int getDate() {
        return date;
    }

    public static void setDate(int date) {
        Person.date = date;
    }

    public static String voltaAData( DateTimeFormatter now){
        return Person.setDate(1992) - "2021"//ano atual
    }

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + now.format(formatter));
        System.out.println(Person.getDate());
    }
}
