package br.univali.trabalho.mdois;

import java.time.LocalDate;

public class Match {                           // Classe Partida
    private static String home;                // Casa
    private static String visitant;            // Visitante
    private static LocalDate dates[] = new LocalDate[10];          // Datas
    private static Integer scoreBoard;         // Placar
    private static boolean win;                // Vencer
    public final Integer id;

    // Metodos Especiais
    public Match(Integer id) {
        this.id = id;
        showView();

        for (int i = 0; i < dates.length; i++){
            System.out.println(dates[i]);
        }
    }

    public static String getHome() {
        return home;
    }

    public static void setHome(String home) {
        Match.home = home;
    }

    public static String getVisitant() {
        return visitant;
    }

    public static void setVisitant(String visitant) {
        Match.visitant = visitant;
    }

    public static LocalDate[] getDates() {
        return dates;
    }

    public static void setDates(LocalDate[] dates) {
        Match.dates = dates;
    }

    public static Integer getScoreBoard() {
        return scoreBoard;
    }

    public static void setScoreBoard(Integer scoreBoard) {
        Match.scoreBoard = scoreBoard;
    }

    public static boolean isWin() {
        return win;
    }

    public static void setWin(boolean win) {
        Match.win = win;
    }

    // Metodos
    public void date(LocalDate dates[]){
        int i = 0;
        dates[i] = LocalDate.now();
        i++;
        System.out.println(dates);
    }
    public void simulation(){
        // Random x 30 segund
        // camisa = gols
        // % chute a gol

    }
    public void setScoreBoardTeams(){
        // casa++ else visit++
        // data = now()
        //
    }
    public void testWin(){
        //temporizador?
    }
    public void showView(){
        System.out.println(this);
        System.out.println(home);
        System.out.println(visitant);
        System.out.println(dates);
        System.out.println(scoreBoard);
        System.out.println(win);
    }
}
