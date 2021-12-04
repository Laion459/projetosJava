package br.univali.exercicios.roteiroum;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("15/03/1999", format);
        System.out.format("formatted date: %s\n", date.format(format));
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getEra());

        LocalDate myBirthday = LocalDate.of(1969, Month.FEBRUARY, 6);
        LocalDate today = LocalDate.now();
        System.out.println("My age: " + Period.between(myBirthday, today).getYears());
        System.out.println(today.isLeapYear()); // é ano bissexto?
        System.out.println(today.isAfter(LocalDate.parse("2049-01-01")));
        System.out.println(today.isBefore(LocalDate.parse("2049-01-01")));
    }
}
