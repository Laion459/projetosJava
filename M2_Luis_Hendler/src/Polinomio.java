import java.util.ArrayList;
import java.util.Objects;


public class Polinomio {

    private Termo polinomioPX;
    private ArrayList <Termo> listaTermos = new ArrayList<>();
    // Métodos Privados

    // Construtor
    public Polinomio(Termo polinomioPX) {
        this.polinomioPX = polinomioPX;
        this.listaTermos.add(polinomioPX);

    }

    public Termo getPolinomioPX() {
        return polinomioPX;
    }

    public void setPolinomioPX(Termo polinomioPX) {
        this.polinomioPX = polinomioPX;
    }

    @Override
    public String toString() {
        return "Polinomio{" +
                "polinomioPX=" + polinomioPX +
                '}';
    }

    // Métodos Públicos

    // Insere insere objeto termo na lista de termos
    public void insere(Termo termo){
        for (Termo t : listaTermos) {
            // se termos com i igual sao somados
            if(Objects.equals(t.getI(), termo.getI())){
                // insere termos com i igual na lista de termos
                t.insere(new Termo(t.getA()+ termo.getA(),t.getI()));
                return;
            }
            // se não for igual só adiciona no fim da lista
            listaTermos.add(termo);
        }
    }

    // Calcula recebe valor de X e retorna valor p(x).
    public double calcula(Float x){
        double resultado = 0;
        for (Termo t : listaTermos){
            resultado += t.calcula(x);
        }
        return resultado;
    }

    // usamos para printar e comparar os termos com i iguais.
    public ArrayList<Termo> getTermo(){
        return listaTermos;
    }

    // insere antes??
    public Polinomio fusao(Polinomio realizaFusao){
        for(Termo t : realizaFusao.getTermo()){
            this.insere(t);
        }
        return realizaFusao;
    }
}
