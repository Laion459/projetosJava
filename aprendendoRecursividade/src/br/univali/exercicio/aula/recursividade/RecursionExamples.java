package br.univali.exercicio.aula.recursividade;

import java.util.ArrayList;

public class RecursionExamples {

    public static ArrayList<String> findPermutations(String str) {
        ArrayList<String> perms = new ArrayList<>();
        RecursionExamples.findPermutations("", str, perms);
        return perms;
    }
    private static void findPermutations(String prefix, String word, ArrayList<String> perms) {
        if (word.isEmpty()) {
            perms.add(prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                RecursionExamples.findPermutations(
                      prefix + word.charAt(i),
                      word.substring(0, i) + word.substring(i + 1, word.length()),
                      perms);
            }
        }
    }


}
