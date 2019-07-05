package model;

public class Elephant extends Animal {

    private String country;

    public Elephant(String nm, String ct, int age, Zookeeper zk, double wgt) {
        super(nm, age, zk, wgt);
        country = ct;
    }
    // getters
    public String getCountry() { return country; }

}