public void lotsGoingOn(List<String> theList){
    for (String s: theList) {
        print(s);
    }

    if (theList.contains("dog")){
        print("dogs!!");
    }else {
        print("no dogs!!");
    }
    print("done");
}

public void print(Object o){
    System.out.println(o);
}