printThreeThings(1, 2, 3);
printThreeThings(4, 5, 6);
public void printThreeThings(int x, int y, int z) {
    print(x);
    print(y);
    print(z);
}
We can imagine the print method above looks something like this:

public void print(Object x) {
    System.out.println(x);
}