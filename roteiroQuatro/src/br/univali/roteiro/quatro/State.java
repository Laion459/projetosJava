package br.univali.roteiro.quatro;

import java.util.Objects;

public class State {

    private final String name;
    private final String abbreviation;

    public State(String name, String abbreviation) {
        PreCondition.mustBe()
                .notEmpty(name)
                .notEmpty(abbreviation);
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return Objects.equals(getName(), state.getName()) && Objects.equals(getAbbreviation(), state.getAbbreviation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAbbreviation());
    }
}
