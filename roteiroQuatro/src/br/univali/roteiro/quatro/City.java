package br.univali.roteiro.quatro;

import java.util.Objects;

public class City {

    private final String name;
    public final State state;

    public City(String name, State state) {
        PreCondition.mustBe()
                .notEmpty(name);
                //.notEmpty(state);
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return Objects.equals(getName(), city.getName()) && Objects.equals(getState(), city.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getState());
    }
}
