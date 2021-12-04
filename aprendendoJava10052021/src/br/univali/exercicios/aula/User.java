package br.univali.exercicios.aula;


public class User {
    private final String loguin;
    private final String password;

    public User(String loguin, String password) {
        this.loguin = loguin;
        this.password = password;
    }

    public String getLoguin() {
        return loguin;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "loguin='" + loguin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User x1 = new User("Leonardo","222");
        System.out.println(x1);
    }

}