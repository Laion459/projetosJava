package br.univali.exercicios.lista;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DateLocalEtc {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("15/03/1999", format);
        System.out.format("formatted date: %s\n", date.format(format));
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getYear());
        System.out.println(date.getEra());



        // math
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" exemplos de decimais class math ");

        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");
        BigDecimal sum = big1.add(big2);
        BigDecimal mult = big1.multiply(big2);
        sum = sum.setScale(2, RoundingMode.HALF_EVEN);
        mult = mult.setScale(2, RoundingMode.CEILING);
        System.out.println(sum.toString());
        System.out.println(mult.toString());



        //RANDOM EXEMPLO
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" exemplos de decimais class RANDOM ");


        Random valueGenerator = new Random();
        // valores pseudo-aleatórios (distribuição uniforme)
        for (int i = 0; i < 10; i++) {
            System.out.println(valueGenerator.nextInt());
        }

        // podemos definir a semente do gerador
        // neste caso, a sequência gerada é sempre a mesma
        valueGenerator.setSeed(342217);
        // e gerar valores entre 0 e 10
        // note que o valor do argumento é exclusivo = 0..Argumento-1
        for (int i = 0; i < 10; i++) {
            System.out.format("%2d ", valueGenerator.nextInt(11));
        }
        for (int i = 0; i < 5; i++) {
                    // valores entre 0 e 1
            System.out.println(valueGenerator.nextDouble());
                        // valores entre 0 e 1
            System.out.println(valueGenerator.nextFloat());
                // true or false
            System.out.println(valueGenerator.nextBoolean());
        }
    }

}
