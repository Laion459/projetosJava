package br.univali.exercicio.aula;

import java.util.ArrayList;

public class Lab {
    private String name;
    private ArrayList<Computer> computers = new ArrayList<>();
    public Lab(String name) {
        this.name = name;
    }
    public void addComputer(Computer computer) {
        if (!computers.contains(computer)) {
            computers.add(computer);
            computer.setCurrentLab(this);
        }
    }
    public String getName() {
        return name;
    }
    public ArrayList<Computer> getComputers() {
        return computers;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + name + '\'' +
                ", computers=" + computers +
                '}';
    }
}
