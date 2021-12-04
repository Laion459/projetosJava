package br.univali.trabalho.mdois;

import java.time.LocalDate;
import java.time.Period;


public class Player {                             // Classe 'Jogador'
    //Atributos
    private final String name;                    // Nome
    private final Integer shirtNumber;            // Numero de camisa
    private LocalDate age;                        // Idade

    private static Integer goals;                 // Gols

    private static Float ability = 50.0f;         // Habilidade
    private static Float height = 50.0f;          // Altura
    private static Float reflections = 50.0f;     // Reflexos
    private static Float roof = 50.0f;            // Cobertura
    private static Float disarm = 50.0f;          // Desarme
    private static Float velocity = 50.0f;        // Velocidade
    private static Float technique = 50.0f;       // Tecnica

    private static String position;               // Posicao
    private static String goalKeeper;             // Goleiro
    private static String attacker;               // Atacante
    private static String defense;                // Defesa

    // Metodos Especiais
    public Player(String name, Integer shirtNumber, LocalDate age) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.age = age;
        playerPosition(shirtNumber);
        validatesHeight(height);
        validatesShirtNumber(shirtNumber);
        skills(position);
        showParty();
    }

    public String getName() {
        return name;
    }

    public Integer getShirtNumber() {
        return shirtNumber;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public static Integer getGoals() {
        return goals;
    }

    public static void setGoals(Integer goals) {
        Player.goals = goals;
    }

    public static Float getAbility() {
        return ability;
    }

    public static void setAbility(Float ability) {
        Player.ability = ability;
    }

    public static Float getHeight() {
        return height;
    }

    public static void setHeight(Float height) {
        Player.height = height;
    }

    public static Float getReflections() {
        return reflections;
    }

    public static void setReflections(Float reflections) {
        Player.reflections = reflections;
    }

    public static Float getRoof() {
        return roof;
    }

    public static void setRoof(Float roof) {
        Player.roof = roof;
    }

    public static Float getDisarm() {
        return disarm;
    }

    public static void setDisarm(Float disarm) {
        Player.disarm = disarm;
    }

    public static Float getVelocity() {
        return velocity;
    }

    public static void setVelocity(Float velocity) {
        Player.velocity = velocity;
    }

    public static Float getTechnique() {
        return technique;
    }

    public static void setTechnique(Float technique) {
        Player.technique = technique;
    }

    public static String getGoalKeeper() {
        return goalKeeper;
    }

    public static void setGoalKeeper(String goalKeeper) {
        Player.goalKeeper = goalKeeper;
    }

    public static String getAttacker() {
        return attacker;
    }

    public static void setAttacker(String attacker) {
        Player.attacker = attacker;
    }

    public static String getDefense() {
        return defense;
    }

    public static void setDefense(String defense) {
        Player.defense = defense;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", shirtNumber=" + shirtNumber +
                ", age=" + age +
                '}';
    }

    // Metodos
    public void skills(String position){          // Habilidades
        if (position == "Goleiro"){
            ability = height * 4 + reflections * 6;
        }
        if (position == "Defesa"){
            ability = roof * 6 + disarm * 4;
        }
       if (position == "Atacante"){
           ability = velocity * 4 + technique * 6;
       }
    }

    public void calculateAge(LocalDate age){    // Calcula a idade
        LocalDate myBirthday = age;
        LocalDate today = LocalDate.now();
        System.out.println("age: " + Period.between(myBirthday, today).getYears());
        // convertir LocalDate para Period...y return age
    }

    public void validatesShirt(){  // Valida camisa

    }

    public Float validatesHeight(Float height){ // Valida altura
        if (height >= 210.0){
            height = 100.0f;
        }else {
            if (height >= 200.0){
                height = 90.0f;
            }else {
                height = 86f;
            }
        }
        return height;
    }
    private void validatesShirtNumber( Integer shirtNumber){
        if (shirtNumber.intValue() < 0){
            System.out.println("Numero de camisa invalido! ");
            // sai do programa....
        }
    }

    public void playerPosition(Integer shirtNumber ){  // Posicao do jogador
        validatesShirtNumber(shirtNumber);             // Valida
        if (shirtNumber.intValue() == 0){
            this.setGoalKeeper("Goleiro");
            ability = height * 4 + reflections * 6;
            height *= 4;
            reflections *= 6;
            position = "Goleiro";
        }
        if (shirtNumber.intValue() == 1 || shirtNumber.intValue() == 2){
            this.setDefense("Defessa");
            ability = roof * 6 + disarm * 4;
            roof *= 6;
            disarm *= 4;
            position = "Defessa";
        }
        if (shirtNumber.intValue() == 3 || shirtNumber.intValue() >= 4){
            this.setAttacker("Atacante");
            ability = velocity * 4 + technique * 6;
            velocity *= 4;
            technique *= 6;
            position = "Atacante";
        }
    }

    public void showParty(){
        System.out.print("Classe: ");
        System.out.println(this);
        System.out.print("Nome: ");
        System.out.println(getName());
        System.out.print("Numero de camisa: ");
        System.out.println(getShirtNumber());
        System.out.print("Idade: ");
        System.out.println(getAge());
        System.out.print("Gols: ");
        System.out.println(getGoals());
        System.out.print("Habilidade: ");
        System.out.println(getAbility());
        System.out.print("Altura: ");
        System.out.println(getHeight());
        System.out.print("Reflexos: ");
        System.out.println(getReflections());
        System.out.print("Cobertura: ");
        System.out.println(getRoof());
        System.out.print("Dessarme: ");
        System.out.println(getDisarm());
        System.out.print("Velocidade: ");
        System.out.println(getVelocity());
        System.out.print("Tecnica: ");
        System.out.println(getTechnique());
        System.out.print("Posicao: ");
        System.out.println(position);
        System.out.println("***************************");

    }
}
