package model;

public class FryCook extends Employee {

    public static final double FRYCOOK_WAGE = 5.50;

    private BurgerByte workBranch;
    protected boolean isGrillReady;


    public FryCook(String name, int age, BurgerByte workBranch) {
        super(name, age);
        this.workBranch = workBranch;
        isGrillReady = false;
        workBranch.addEmployee(this);
    }

    //getters
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isGrillReady() { return isGrillReady; }

    @Override
    public void startWork(double hours) {
        isGrillReady = true;
        atWork = true;
        logHoursWorked(hours);
        System.out.println("Grill is ready to cook with!");
    }

    // EFFECTS: close the grill for the day, and update this FryCook's work status
    @Override
    public void leaveWork() {
        isGrillReady = false;
        atWork = false;
        System.out.println("Grill is closed for the day.");
    }

    // EFFECTS: computes wages for the day
    @Override
    public double computeWage() {
        return (hoursWorked * (FRYCOOK_WAGE + BASE_WAGE));
    }
}

