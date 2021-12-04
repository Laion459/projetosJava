package br.univali.exercicios.aula;

class User {

    private final String login;
    private final String password;
    private final int levelAccess;

    public User(String login, String password, int levelAccess){
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

    public static void main(String[] args) {
        System.out.println(User.this.login);
    }
}

//java: variável não estática que não pode ser referenciada a partir de um contexto estático