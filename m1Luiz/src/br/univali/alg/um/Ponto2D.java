package br.univali.alg.um;

public class Ponto2D {

    private float x;
    private float y;

    // Metodos especiais


    public Ponto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public boolean estaAcimaDe(float x, float y){
        System.out.println("acima de: ");
        return true;
    }

    public boolean estaAbaixoDe(float x, float y){
        //if (x > 0 ){ esta acima se nao abaixo
        // esta a esquerda senao a direita
        return true;
    }

    public boolean estaAEsquerdaDe(float x, float y){
        return true;
    }

    public boolean estaADireitaDe(float x, float y){
        return true;
    }

    // Métodos publicos

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
