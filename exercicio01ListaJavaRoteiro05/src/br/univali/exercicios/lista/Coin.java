package br.univali.exercicios.lista;

import java.util.Random;

public enum Coin {
    HEAD, TAIL;


    public static Coin toss() {
        return Coin.values()[new Random().nextInt(2)];
    }

    public static void main(String[] args) {
        System.out.println(toss());


        for (int i = 0; i < 10; i++) {
            System.out.println(Coin.toss());
        }
    }



}
