package model;


import java.util.ArrayList;

public class Zookeeper {

    private String name;
    private int age;
    private ArrayList<Animal> animalList;
    private Animal favourite;

    // TODO: follow the instructions on the webpage to implement this class

    public Zookeeper(String name, int age) {
        this.name = name;
        this.age = age;
        this.favourite = null;
        this.animalList = new ArrayList<>();
    }

    //getters
    public String getName() { return name;}
    public int getAge() { return age; }
    public void getFavourite() { System.out.println(favourite); }
    public ArrayList<Animal> getAnimalList() { return animalList; }

    //setters
    public void setFavourite(Animal a) { favourite = a; }

    //EFFECTS: add animal to the animalsList
    public void addAnimal(Animal a)  {
        animalList.add(a);
    }

    //EFFECTS: remove animal to the animalList
    public boolean removeAnimal(Animal animal) {
        for(Animal a: animalList) {
            if(a.equals(animal)) {
                animalList.remove(animal);
                return true;
            }
        }
        return false;
    }
}