package br.univali.exercicios.lista;

import  java.util.ArrayList;
import java.util.Collections;

public class ListasDeArray {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> users = new ArrayList<>();


    public ListasDeArray(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();


        names.add("Starlord");
        names.add("Gamora");
        names.add("Drax");
        names.add("Rocket");
        names.add("Groot");

                  // mostra a lista inteira
        System.out.println(names);
                 // um a um sem contador
        for(String name : names) {
            System.out.println(name);
        }
                // um a um com contador
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        System.out.println("---------------------------------------------");
        System.out.println("       ");

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ironman", "123", 1));
        users.add(new User("spiderman", "213", 1));
        users.add(new User("wolverine", "321", 1));
        users.add(new User("hulk", "132", 1));

        System.out.println(users);

        users.remove(2); // remove o user wolverine
        System.out.println(users);

        users.remove(users.get(2)); // remove o user hulk
        System.out.println(users);

        while (!users.isEmpty()) {
                // sempre elimina o primeiro objeto da lista
            users.remove(0);
        }
        System.out.println(users);

        System.out.println("---------------------------------------");

        Collections.shuffle(users);

        for (User user : users) {
            System.out.println(user.getLogin());
        }
    }
}
