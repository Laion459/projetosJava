package br.univali.roteiro.quatro;

public class Address {

    private final String streetLine1;
    private final String stretLine2;
    private final String zipCode;
    private final City city;

    public Address(String streetLine1, String stretLine2,City city, String zipCode) {
        this.streetLine1 = streetLine1;
        this.stretLine2 = stretLine2;
        this.zipCode = zipCode;
        this.city = city;
    }


    public String getStreetLine1() {
        return streetLine1;
    }

    public String getStretLine2() {
        return stretLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetLine1='" + streetLine1 + '\'' +
                ", stretLine2='" + stretLine2 + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city=" + city +
                '}';
    }


}
