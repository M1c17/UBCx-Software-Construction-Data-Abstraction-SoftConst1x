package model;

public class Animal {

  protected String name;
  protected int age;
  protected Zookeeper careTaker;
  protected double weight;

  public Animal(String nm, int age, Zookeeper zk, double wgt) {
    this.name = nm;
    this.age = age;
    this.careTaker = zk;
    this.weight = wgt;
  }

  // getters
  public void getName() { System.out.println(name);}
  public void getAge() { System.out.println(age);}
  public Zookeeper getCareTaker() { return careTaker; }
  public void getWeight() { System.out.println(weight); }
}
