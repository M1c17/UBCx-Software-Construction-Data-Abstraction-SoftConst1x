public void printList(List<String> theList)
    for (String s: theList) {
        print(s);
        print("done item" + s);      //added the "s" variable so it shows when printed
    } 
        print("done" + theList);     //added theList to the print statement to show its contents
    }

    public void print(Object o){
        System.out.println(o);
    }