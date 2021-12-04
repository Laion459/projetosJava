package br.univali.prova.mdois;

import java.util.Arrays;

public class Company {
    // Atributos
    private String name;                                // nome da compania
    //private static Employee employees[];              // empregados
    //private static Float payCheck[];                  //contracheque
    //private static String department[];               // departamento
    private static Float bruteSalary;                   // salario bruto 2*****
    private static Float baseSalary;                    // salario base
    private static Float netSalary;                     // salario liquido
    private static Float hoursWorked;                   // horas trabalhadas
    private static final Integer workingHours = 160;    // jornada de trabalho
    private static Integer overTime;                    // hora extra
    private static Float inss;                          // inss
    private Float maxSalary;                            // salario maximo

    Employee employees[] = new Employee[100];
    Float payCheck[] = new Float[100];

// Metodos Especiais
    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Float getBruteSalary() {
        return bruteSalary;
    }

    public static void setBruteSalary(Float bruteSalary) {
        Company.bruteSalary = bruteSalary;
    }

    public static Float getBaseSalary() {
        return baseSalary;
    }

    public static void setBaseSalary(Float baseSalary) {
        Company.baseSalary = baseSalary;
    }

    public static Float getNetSalary() {
        return netSalary;
    }

    public static void setNetSalary(Float netSalary) {
        Company.netSalary = netSalary;
    }

    public static Float getHoursWorked() {
        return hoursWorked;
    }

    public static void setHoursWorked(Float hoursWorked) {
        Company.hoursWorked = hoursWorked;
    }

    public static Integer getWorkingHours() {
        return workingHours;
    }

    public static Integer getOverTime() {
        return overTime;
    }

    public static void setOverTime(Integer overTime) {
        Company.overTime = overTime;
    }

    public static Float getInss() {
        return inss;
    }

    public static void setInss(Float inss) {
        Company.inss = inss;
    }
    public Float getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Float maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    // Metodos Publicos
    /*
    Valida numero, classe Float menor que um mostra erro e aborta o programa.
     */
    private void validate(Float number){
        if (number < 1){
            System.out.println("Erro!");
            //exit(0);
        }
    }

    public void calculateSalary(){

    }                                    // ***

    private boolean validateSalary(Float salary){   // valida salario
        if (salary < 0){
            System.out.println("Error! Salario invalido.");
            //abort(); exit(0);
            return false;
        }
        return true;
    }

    /**
     * Desconto de imposto de renda.
     * @param netSalary salario liquido.
     * @return salario liquido menos porcentagem desconto IR.
     */
    public Float incomeTax(Float netSalary){
        setNetSalary(getBaseSalary());
        validateSalary(netSalary);

        if (netSalary <= 1499.15){
            setNetSalary(netSalary);
        }

        if (netSalary <= 2246.75){
            setNetSalary(netSalary - ((netSalary * 7.5f) /100) );
        }

        if (netSalary <= 2995.7){
            setNetSalary(netSalary - ((netSalary * 15.0f) /100) );
        }

        if (netSalary <= 3743.19){
            setNetSalary(netSalary - ((netSalary * 22.5f) /100) );
        }else {
            setNetSalary(netSalary - ((netSalary * 27f) /100) );
        }

        return netSalary;
    }

    /**
     * Calcula o desconto do INSS sobre o salario liquido.
     * @param netSalary salario liquido.
     * @return salario liquido menos desconto inss.
     */
    public Float socialInsurance(Float netSalary) {
        if (netSalary <= 482.93){
            setNetSalary(netSalary - ((netSalary * 11) /100) );
        }else {
            setNetSalary(netSalary - 23.1223f);
        }
        return inss;
    }

    /**
     * salva dados de folha de pagamentos.
     * @param employee funcionario a ser guradado.
     * @param hoursWorked horas trabalhadas pelo empregado.
     */
    public void payroll(Employee employee, Float hoursWorked){
        int i = 0;

        employees[i] = employee;
        employee.setSalary(employee.getSalary() + calculateSalaryBase(hoursWorked,
                employee.getSalary()) - (incomeTax(employee.getSalary()) + socialInsurance(employee.getSalary())));
        payCheck[i] = employee.getSalary();
        i++;
        //setMaxSalary(0f);
        if ( employee.getSalary() > maxSalary){
            setMaxSalary(employee.getSalary());
        }
    }

    public void runMonths(){    // Roda meses para testes
        //payroll();
    }

    /**
     * Calcula o salario bruto/base pelas horas trabalhadas.
     * @param hoursWorked horas trabalhadas.
     * @param baseSalary salario base.
     * @return salario base calculado.
     */
    public Float calculateSalaryBase(Float hoursWorked, Float baseSalary){
        if (hoursWorked < 144){
            setBaseSalary((((getBaseSalary() / 4) / 5) / 8) * hoursWorked);
        }else {
            Float aux = hoursWorked - 160;
            Float aux2 = (((baseSalary / 4) /5) /8) / 2;
            setBaseSalary(baseSalary + (aux * aux2));
        }
        return baseSalary;
    }

   //public Float overTimeEmployee(Float hoursWorked, Float bruteSalary){
   //    validate(hoursWorked);
   //    validate(bruteSalary);

   //    if (hoursWorked > 160.0){
   //        baseSalary += (50 * baseSalary) / 100; // = % cada h > 160?
   //    }

   //    return baseSalary;
   //}
}
