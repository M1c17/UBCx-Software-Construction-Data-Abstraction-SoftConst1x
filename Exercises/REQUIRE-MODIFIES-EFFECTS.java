//REQUIRES: amount >=0
public double deposit(double amount){
    balance = balance + amount;
    return balance
}

//REQUIRES: y != 0
public double divide (int x, int y){
    return x/y;
}



//MODIFIES: this
public double deposit(double amount) {
    balance = balance + amount;
    return balance;
}

//MODIFIES: this, deposits
public double deposit(double amount, List<Integer> deposits){
    deposits.add((int) amount); // note we need to cast this double to an int
    balance = balance + amount
    return balance;
}

//EFFECTS: adds amoun to balance
//         return balance  + amount.
public double deposit(double amount) {
    balance = balance + amount;
    return balance;
}