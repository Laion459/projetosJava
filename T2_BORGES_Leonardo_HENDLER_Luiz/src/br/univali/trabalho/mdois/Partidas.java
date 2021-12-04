package br.univali.trabalho.mdois;

import java.time.LocalDate;

public class Partidas {

    private final String CASA;
    private final String VISITANTE;
    private static LocalDate data;
    private static int placar;

    public Partidas(String CASA, String VISITANTE) {
        this.CASA = CASA;
        this.VISITANTE = VISITANTE;
    }

    public String getCASA() {
        return CASA;
    }

    public String getVISITANTE() {
        return VISITANTE;
    }

    public static LocalDate getData() {
        return data;
    }

    public static int getPlacar() {
        return placar;
    }

    public static void setData(LocalDate data) {
        Partidas.data = data;
    }

    public static void setPlacar(int placar) {
        Partidas.placar = placar;
    }

    @Override
    public String toString() {
        return "Partidas{" +
                "CASA='" + CASA + '\'' +
                ", VISITANTE='" + VISITANTE + '\'' +
                '}';
    }
}
