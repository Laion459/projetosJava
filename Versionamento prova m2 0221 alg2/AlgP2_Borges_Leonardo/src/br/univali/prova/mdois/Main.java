package br.univali.prova.mdois;

public class Main {


    public static void main(String[] args) {

        // cria compania
        Company company = new Company("ELETRONS AMESTRADOS");
        System.out.println(company);
        System.out.println("*********************************************");


        // cria funcionarios
        Employee employee = new Employee("Leonardo", "CEO", 1500000f);
        Employee employee2 = new Employee("Bruna", "Diretora", 7000f);
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println("*********************************************");


        System.out.println("Funcionario: " + employee.getName());
        System.out.println("Departamento: " + employee.getDepartment());
        System.out.println("Salario: " + employee.getSalary());
        System.out.println("----------------------------------");
        System.out.println("Funcionario: " + employee2.getName());
        System.out.println("Departamento: " + employee2.getDepartment());
        System.out.println("Salario: " + employee2.getSalary());

        System.out.println("*********************************************");

        // add funcionario em company
        company.employees[0] = employee;
        System.out.println(company.employees[0]);

        company.employees[1] = employee2;
        System.out.println(company.employees[1]);

        System.out.println("*********************************************");
        // busca funcionario
        System.out.println("Fncionario id 0: " + company.employees[0].getName());

        System.out.println("*********************************************");

        // operacoes internas ficou sem terminar...
            // null pointer exeption em todos os testes.

        // mostra salario maximo (tambem com defeito)
        //System.out.println(Company.getNetSalary());
        System.out.println("Salario maximo: " + company.getMaxSalary());

    }
}
