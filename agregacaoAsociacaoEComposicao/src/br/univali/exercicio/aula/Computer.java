package br.univali.exercicio.aula;

public class Computer {
    private String name;
    private Lab currentLab;
    public Computer(String name) {
        this.name = name;
    }
    public void setCurrentLab(Lab lab) {
        if (currentLab == null || !currentLab.equals(lab)) {
            currentLab = lab;
            lab.addComputer(this);
        }
    }
    public String getName() {
        return name;
    }
    public Lab getCurrentLab () {
        return currentLab;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", currentLab=" + currentLab +
                '}';
    }

    public static void main(String[] args) {
        Computer x = new Computer("X1");
        Lab lab = new Lab("Y2");
        System.out.println(x.name);
        System.out.println(x.currentLab);
        System.out.println();
        System.out.println(lab);
        System.out.println();
        System.out.println(lab.getComputers());
        System.out.println(lab.getName());
        //System.out.println(x.currentLab);
    }
}
