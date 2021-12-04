package br.univali.exercicios.aula;

public class ArrayListSegundaParte {
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

        public static void main(String[] args) {

        }
}
