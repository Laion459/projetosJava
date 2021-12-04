package br.univali.trabalho.mdois;

public class Time {
    private final Integer MAX_JOGADORES = 5;
    private final String nome;
    private static Integer vitorias;
    private static Integer empates;
    private static Integer derrotas;
    private static Integer gols;
    private static Jogador timeJogadores[];

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Integer getVitorias() {
        return vitorias;
    }

    public static Integer getEmpates() {
        return empates;
    }

    public static Integer getDerrotas() {
        return derrotas;
    }

    public static Integer getGols() {
        return gols;
    }

    public static void setVitorias(Integer vitorias) {
        Time.vitorias = vitorias;
    }

    public static void setEmpates(Integer empates) {
        Time.empates = empates;
    }

    public static void setDerrotas(Integer derrotas) {
        Time.derrotas = derrotas;
    }

    public static void setGols(Integer gols) {
        Time.gols = gols;
    }

    public static Jogador[] getTimeJogadores() {
        return timeJogadores;
    }

    public static void setTimeJogadores(Jogador[] timeJogadores) {
        Time.timeJogadores = timeJogadores;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                '}';
    }


    public void montaTime(){

        Jogador goleiro   = new Jogador("Pedro",25,0);
        Jogador atacante1 = new Jogador("Lucas",24,1);
        Jogador atacante2 = new Jogador("Daniel",11,2);
        Jogador defesa1   = new Jogador("Saimon",18,4);
        Jogador defesa2   = new Jogador("Gaston",26,5);
        Time w = new Time("BOCA JUNIOR");

        System.out.println(w.getNome());

    }

    public static void main(String[] args) {

        Time x = new Time("RACING");
        x.montaTime();



        System.out.println(x.getNome());
    }
}
