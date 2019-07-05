package model;

public class Horse extends Animal{

    private double topSpeed;
    private String country;

    public Horse(String nm, String ct, int age, Zookeeper zk, double wgt, double ts) {
        super(nm, age, zk, wgt);
        topSpeed = ts;
    }

    // getters
    public double getTopSpeed() { return topSpeed; }
    public String getCountry() { return country; }


}