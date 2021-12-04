package br.univali.trabalho.mdois;

import java.time.LocalDate;

public class Team {
    // Atributos
    private final  String name;        // Nome
    private static Player players[] = new Player[10];    // Jogadores
    private static Integer victories;   // Vitorias
    private static Integer ties;        // Empates
    private static Integer defeats;     // Derrotas

    // Metodos Especiais
    public Team(String name) {
        this.name = name;
        showTeam();
        createTeam();
    }

    public final String getName() {
        return name;
    }


    public static Player[] getPlayers() {
        return players;
    }

    public static void setPlayers(Player[] players) {
        Team.players = players;
    }

    public static Integer getVictories() {
        return victories;
    }

    public static void setVictories(Integer victories) {
        Team.victories = victories;
    }

    public static Integer getTies() {
        return ties;
    }

    public static void setTies(Integer ties) {
        Team.ties = ties;
    }

    public static Integer getDefeats() {
        return defeats;
    }

    public static void setDefeats(Integer defeats) {
        Team.defeats = defeats;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }

// Metodos

    public void addPlayers(Player player){
        //validar array
        for (int i = 0; i <= players.length; i++){
            if (players[i] == null){
                players[i] = player;
            }else {
                i++;
            }
        }
    }

    public void createTeam(){
        Player x = new Player("Leo",10, LocalDate.of(1992,2,23));
        Player x2 = new Player("Messi",0,LocalDate.of(2000,8,15));
        Player x3 = new Player("Buna",2,LocalDate.of(1988,2,8));
        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);

        players[0] = x;
        players[1] = x2;
        players[2] = x3;
        //addPlayers(players,x3);
        System.out.println();
        System.out.println("////////////////////////////");

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println(players[i]);
            }
        }
    }
    public Float classifyTeam(Float ability,Player players[]){
        Float total = 0f;
        for (int i = 0; i < players.length; i++){

        }
        return total;
    }
    public void showTeam(){
        System.out.println(this);
    }
}
