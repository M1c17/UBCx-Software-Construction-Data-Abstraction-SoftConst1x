package model;

public abstract class Employee {

  public static final double BASE_WAGE = 10.00;

  protected String name;
  protected int age;
  protected double hoursWorked;
  protected boolean atWork;


  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
    hoursWorked = 0;
    atWork = false;

  }

  // getters
  public String getName() { return name; }
  public int getAge() { return age; }
  public boolean isAtWork() { return atWork; }
  public double getHoursWorked() { return hoursWorked; }

  // MODIFIES: this
  // EFFECTS: adds hours to the hoursWorked field
  public void logHoursWorked(double hours) {
      hoursWorked += hours;
  }

  // EFFECTS: the grill should be ready to go, hours should be logged, and
  //          the atWork field should be updated to reflect this FryCook's status
  public abstract void startWork(double hours);

  // EFFECTS: close the grill for the day, and update this FryCook's work status
  public abstract void leaveWork();

  // EFFECTS: computes wages for the day
  public abstract double computeWage();
}
