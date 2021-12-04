package br.univali.exercicios.lista;

public enum TrafficLight {

    RED(30), AMBER(10), GREEN(30);

    private int seconds;

    TrafficLight(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public static void main(String[] args) {

        System.out.println(RED.seconds);
        System.out.println(AMBER);
        System.out.println(GREEN);
    }

}
