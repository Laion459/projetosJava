package br.univali.roteiro01;

public class RoteiroUm {

    public static void main(String[] args) {
        System.out.println("Meu primeiro programa em Java! ");
        System.out.print("Argumentos passados: ");
        for (int i = 0; i < args.length; i++){
            System.out.format("'%s'", args[i]);
        }
    }
}
