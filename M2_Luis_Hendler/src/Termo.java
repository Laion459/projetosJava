public class Termo {
    private Float a;
    private Float i;
    private Termo termo;

    // Métodos Privados

    // Constructor
    public Termo(Float a, Float i) {
        this.a = a;
        this.i = i;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getI() {
        return i;
    }

    public void setI(Float i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Termo{" +
                "a=" + a +
                ", i=" + i +
                '}';
    }

    // Métodos Públicos

    // Insere recebe obj 'termo' e substitui valores Ai Xi do termo corrente por aqueles do termo recebido como parametro
    public void insere(Termo t) {
        this.a = t.getA();
        this.i = t.getI();
    }

    // Calcula recebe valor de X como parâmetro e retorna o valor calculado.
    public double calcula(Float x){
        return a * Math.pow(x,i);
    }
}
