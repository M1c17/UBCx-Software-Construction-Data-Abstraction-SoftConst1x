public void printIfThree(int i) {
    if (i == 3) {
        print("yay");
        print("yup");
    }
    print("done");
}
//public void printNum(int i) {
    if (i == 3) {
        print("three");
    } else {
        print("not 3!");
        print(i);
    }
    print("done");
}
//We can imagine the print method above looks something like this:

public void print(Object x) {
    System.out.println(x);
}
