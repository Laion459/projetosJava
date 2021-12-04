package br.univali.roteiro.cinco;

import br.univali.thiry.company.Company;
import br.univali.thiry.person.Employee;
import br.univali.thiry.person.Student;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Metáfora para um caderno de endereços.
 */
public class ContactBook {

    /**
     * Critérios de ordenação
     */
    public static enum OrderBy { NAME, EMAIL };
    /**
     * Lista de contatos.
     */
    private final List<Contactable> contacts = new ArrayList<>();

    /**
     * NAME_ORDER é um objeto instanciado de uma classe anônima que implementa a
     * interface Comparator<Contactable>. Neste caso, a comparação é feita entre
     * os nomes dos dois Contactable.
     */
    private static final Comparator<Contactable> NAME_ORDER = new Comparator<Contactable>() {
        @Override
        public int compare(Contactable c1, Contactable c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };

    /**
     * EMAIL_ORDER é um objeto instanciado de uma classe anônima que implementa a
     * interface Comparator<Contactable>. Neste caso, a comparação é feita entre
     * os emails dos dois Contactable.
     */
    private static final Comparator<Contactable> EMAIL_ORDER = new Comparator<Contactable>() {
        @Override
        public int compare(Contactable c1, Contactable c2) {
            return c1.getEmail().compareTo(c2.getEmail());
        }
    };        
    
    /**
     * Adiciona um novo contato.
     * 
     * @param contact o contato a ser adicionado
     */
    public void add(Contactable contact) {
        // inserir validações aqui
        // nome e email devem ser válidos
        // não permitir emails repetidos
        contacts.add(contact);
    }
    
    /**
     * Envia um email para um contato específico.
     * 
     * @param subject o assunto da mensagem
     * @param message a mensagem a ser enviada
     * @param contact o contato para o qual a mensagem deve ser enviada
     */
    public void sendEmail(String subject, String message, Contactable contact) {
        // inserir validações aqui
        // subject e message devem ser válidos
        // verificar se contato existe (pelo email que é único)
        // aqui é apenas uma simulação do email sendo enviado
        System.out.println("sending [" + subject + ": \"" + message + "\"] to "
                + contact.getName() + " <" + contact.getEmail() + ">");
    }

    /**
     * Envia um email para toda a lista de contatos.
     * 
     * @param subject o assunto da mensagem
     * @param message a mensagem a ser enviada
     */
    public void sendEmail(String subject, String message) {
        for (Contactable contact: contacts) {
            sendEmail(subject, message, contact);
        }
    }
    
    /**
     * Ordena a lista dos contatos pelo nome (default).
     */
    public void sort() {
        contacts.sort(NAME_ORDER);
    }

    /**
     * Ordena a lista dos contatos de acordo com os critérios desejados.
     *
     * @param orderBy o critério para a ordenação
     */
    public void sort(OrderBy orderBy) {
        contacts.sort(orderBy == OrderBy.NAME ? NAME_ORDER : EMAIL_ORDER);
    }
}

class ContactBookLocalTest {

    private static ContactBook contactBook = new ContactBook();
    private static State sc = new State("Santa Catarina", "SC");
    private static City florianopolis = new City("Florianópolis", sc);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static void addEmployees() {
        contactBook.add(new Employee(
                "Orin Curry",
                LocalDate.parse("15/01/1976", formatter),
                LocalDate.parse("01/03/2000", formatter),
                40,
                new BigDecimal("22.80"),
                new Address("Street Line", "Street Line", florianopolis, "88000000"),
                "orin@com"));
        contactBook.add(new Employee(
                "Susan Kent-Barr",
                LocalDate.parse("06/10/1969", formatter),
                LocalDate.parse("09/08/1995", formatter),
                40,
                new BigDecimal("25.23"),
                new Address("Street Line", "Street Line", florianopolis, "88000000"),
                "susan@com"));
    }

    private static void addStudents() {
        contactBook.add(new Student(
                "Bruce Wayne",
                LocalDate.parse("02/05/1996", formatter),
                LocalDate.parse("01/03/2017", formatter),
                new Address("Street Line", "Street Line", florianopolis, "88000000"),
                "wayne@com"));
        contactBook.add(new Student(
                "Emma Grace Frost",
                LocalDate.parse("23/09/1994", formatter),
                LocalDate.parse("31/07/2016", formatter),
                new Address("Street Line", "Street Line", florianopolis, "88000000"),
                "frost@com"));
    }

    private static void addCompanies() {
        contactBook.add(new Company(
                "ACME",
                "acme@com",
                LocalDate.parse("01/01/1960", formatter),
                new Address("Street Line", "Street Line", florianopolis, "88000000")));
        contactBook.add(new Company(
                "Alibi Bar",
                "alibibar@com",
                LocalDate.parse("06/07/1971", formatter),
                new Address("Street Line", "Street Line", florianopolis, "88000000")));
    }


    public static void addContacts() {
        addStudents();
        addCompanies();
        addEmployees();
    }

    public static void main(String[] args) {
        // simulando a inclusão de contatos...
        addContacts();
        // mostrando todos os contatos...
        System.out.println(contactBook.toString());
        // ordenando
        contactBook.sort(ContactBook.OrderBy.NAME);
        // e testando emails em ordem alfabética de nome
        contactBook.sendEmail("Happy New Year!", "Dear Friends, blah blah blah...");
        // e testando emails em ordem alfabética de email
        contactBook.sort(ContactBook.OrderBy.EMAIL);
        // e testando emails em ordem alfabética de nome
        contactBook.sendEmail("Happy New Year!", "Dear Friends, blah blah blah...");
    }
}

