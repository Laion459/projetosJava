package br.univali.exercicios.lista;

public class User {
    private final String login;
    private final String password;
    private final int levelAccess;

    public User(String login, String password, int levelAccess) {
        this.login = login;
        this.password = password;
        this.levelAccess = levelAccess;

    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public int getLevelAccess() {
        return levelAccess;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", levelAccess=" + levelAccess +
                '}';
    }

    public static void main(String[] args) {
        int var = 10;
        short number = 2000;
        User user1 = new User("starlord", "123", 3);
        User user2 = new User("gamora", "321", 1);
        System.out.println(user1);
        System.out.println(user2);

    }
}