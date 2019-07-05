package model;

public abstract class Vegetable  implements Growable{

  private String name;
  private VegType type;
  private String instructions;

  public Vegetable(String name, VegType type) {
    this.name = name;
    this.type = type;
    this.instructions = instructions;
    //setName(name);
    //setType(type);
    //setInstruction("");
  }
  //getters
  public String getName() { return name;}
  public VegType getType() { return type; }
  @Override
  public String getInstructions() { return instructions; }

  public void setName(String name) { this.name = name;}
  public void setType(VegType type) { this.type = type; }
  public void setInstruction(String instructions) {this.instructions = instructions;}





}
