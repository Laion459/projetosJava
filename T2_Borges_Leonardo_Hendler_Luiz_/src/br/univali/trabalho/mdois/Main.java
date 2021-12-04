package br.univali.trabalho.mdois;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Player x = new Player("Leo",10, LocalDate.of(1992,2,23));
        Player x2 = new Player("Messi",0,LocalDate.of(2000,8,15));
        System.out.println(x);
        System.out.println("----------------------");
        System.out.println(x2);

        Team teamOne = new Team("River Plate");
        Team teamTwo = new Team("Maffu Momme");
//
        Player player = new Player("Luiz",3, LocalDate.of(2002,7,2));
        //teamOne.addPlayers(player);
//
        System.out.println(teamOne);
        System.out.println("======================");
        System.out.println(teamTwo);

        Match match = new Match(1);
        System.out.println(match.id);
    }
}
