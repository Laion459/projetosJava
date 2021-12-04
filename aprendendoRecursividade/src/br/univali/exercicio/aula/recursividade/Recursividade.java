package br.univali.exercicio.aula.recursividade;

public class Recursividade {

    public long factorialWithoutRecursion(int n) {
        long mult = 1;
        for (int i = 1; i <= n; i++) {
            mult *= i;
        }
        return mult;
    }
    private long factorialWithRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialWithRecursion(n-1);
    }
    private long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n-1);
    }

    public int sum(int n) {
        return n == 1 ? n : n + sum(n - 1);
    }

    public static String toBinary(int n) {
        if (n <= 1) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);
    }

    private long fibonacci1(int n) {
        // throw if n < 1 (iniciando a série em 1)
        return (n <= 2) ? 1 : fibonacci1(n-1) + fibonacci1(n-2);
    }
    private long fibonacci0(int n) {
        // throw if n < 0 (iniciando a série em 0)
        if (n == 0) {
            return 0;
        }
        return (n < 2) ? 1 : fibonacci0(n-1) + fibonacci0(n-2);
    }

    private static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length()-1));
        }
        return false;
    }



    public double power(double base, double exponent){
        if (exponent == 0){
            return 1;
        }
        return base * Math.pow(base,exponent -1);
    }


    public static void main(String[] args) {
        Recursividade x = new Recursividade();
        System.out.println(x.factorialWithoutRecursion(5) + " <-  Factorial de: 5");
        System.out.println(x.factorialWithRecursion(5) + " <-  Factorial de: 5");
        System.out.println(x.factorial(5) + " <-  Factorial de: 5");
        System.out.println("-----------------------");

        System.out.println(x.sum(8) + " < - Soma consecutiva até 10");

        System.out.println("-----------------------");

        System.out.println(Recursividade.toBinary(2) + ": Binário || Decimal: 2");
        System.out.println(Recursividade.toBinary(100) + ": Binário || Decimal: 100");
        System.out.println(Recursividade.toBinary(999) + ": Binário || Decimal: 999");
        System.out.println(Recursividade.toBinary(15) + ": Binário || Decimal: 15");

        System.out.println("-----------------------");


        System.out.println(x.fibonacci1(9) + " Fibonacci = 1");
        System.out.println(x.fibonacci0(8) + " Fibonacci = 0");

        System.out.println("-----------------------");

        System.out.println(Recursividade.isPalindrome("LEONARDO") + " Is polindrome? ");
        System.out.println(Recursividade.isPalindrome("1000") + " Is polindrome? ");
        System.out.println(Recursividade.isPalindrome("omo") + " Is polindrome? ");

        System.out.println("-----------------------");

        RecursionExamples y = new RecursionExamples ();
        System.out.println("ABC:");
        System.out.println(RecursionExamples.findPermutations("ABC"));

        System.out.println("-----------------------");
        System.out.println("Base = 10 || Expoente = 2 ");
        System.out.println(x.power(10,2));
    }
}
