package br.univali.trabalho.mdois;

public class Jogador {

    private final String nome;
    private final Integer idade;
    private final Integer numeroCamisa;
    public static Integer gols;
    private static int id = 0;

    public Jogador(String nome, Integer idade, Integer numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.numeroCamisa = numeroCamisa;
        this.id++;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getNumeroCamisa() {
        return numeroCamisa;
    }

    public static Integer getGols() {
        return gols;
    }

    public static void setGols(Integer gols) {
        Jogador.gols = gols;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numeroCamisa=" + numeroCamisa +
                '}';
    }

    public void showTela(){
        System.out.println("Jogador id: "+ id);
        System.out.println("Nome:"+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Numero de camisa: "+this.getNumeroCamisa());
        System.out.println("Quantidade total de gols: "+this.getGols());
    }

    public static void main(String[] args) {
        System.out.println(" teste add jogador? ");
        Jogador x = new Jogador("Leonardo",29,10);
        x.gols = 5;
        x.showTela();

        System.out.println("****************************************");

        Jogador x1 = new Jogador("Yonatan",32,01);
        x1.gols = 7;
        x1.showTela();
    }
}
