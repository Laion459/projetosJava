package br.univali.exercicios.aula;

public class ArrayList {
    java.util.ArrayList<String> names = new ArrayList<>();
    java.util.ArrayList<Integer> numbers = new ArrayList<>();

    names.add("Starlord");
    names.add("Gamora");
    names.add("Drax");
    names.add("Rocket");
    names.add("Groot");
    // mostra a lista inteira
    System.out.println(names);
    // um a um sem contador
    for (String name : names) {
            System.out.println(name);
        }
    // um a um com contador
    for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    public static void main(String[] args) {

    }

}
