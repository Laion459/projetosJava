package br.univali.roteiro05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada: " + now.format(formatter));


}