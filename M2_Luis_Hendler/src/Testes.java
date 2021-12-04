public class Testes {
    public static void main(String[] args) {

        // Testes
        System.out.println();
        System.out.println("#### Bem vindo a parte de testes ####");
        System.out.println();

        System.out.println("**** Teste Termo ****");
        Termo termo = new Termo(2f,3f);
        System.out.println(termo);
        System.out.println();

        System.out.println("**** Test Calcula termo: ****");
        Termo termo1 = new Termo(2f,3f);
        System.out.println(termo1.calcula(4f));
        System.out.println();


        System.out.println("**** Teste insere termo: ****");
        Termo termo2 = new Termo(5f,8f);
        System.out.println(termo2);
        System.out.println();

        System.out.println("**** Teste add termo: ****");
        termo.setA(5f);
        termo.setI(6f);
        System.out.println(termo);
        System.out.println();

        System.out.println("**** Test calcula termo: ****");
        System.out.println(termo.calcula(10f));
        System.out.println();

        System.out.println("**** Teste Polinomio: ****");
        Polinomio polinomio = new Polinomio(termo);
        System.out.println(polinomio);
        System.out.println();

        System.out.println("**** Test insere polinomio: ****");
        System.out.println(polinomio);
        System.out.println();

        System.out.println("**** Teste calcula polinomio: ****");
        System.out.println(polinomio.calcula(5f));
        System.out.println();

        System.out.println("**** Teste fusão polinomio: ****");
        System.out.println(polinomio.fusao(polinomio));
        System.out.println();
    }
}
